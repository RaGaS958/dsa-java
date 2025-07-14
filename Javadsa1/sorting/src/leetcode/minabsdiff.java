package leetcode;
import java.util.*;
public class minabsdiff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mindiff[][]=  mindistdifference(arr);
        for(int i=0;i< mindiff.length;i++)
        {
            System.out.println(Arrays.toString(mindiff[i]));
        }
    }
    static int[][] mindistdifference(int [] arr)
    {
        Arrays.sort(arr);
        int min=mind(arr);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            int dif=Math.abs(arr[i]-arr[i+1]);
            if(dif ==min)
            {
               ArrayList<Integer> sub=new ArrayList<>();
               sub.add(arr[i]);
               sub.add(arr[i+1]);
                list.add(sub);

            }
        }
        int diff[][]=new int[list.size()][2];
        for(int i=0;i<diff.length;i++)
        {
            diff[i][0]=list.get(i).get(0);
            diff[i][1]=list.get(i).get(1);

        }
        return diff;
    }
    static int mind(int arr[])
    {
        int min=9999999;
        for(int i=0;i<arr.length-1;i++)
        {
            int dif=Math.abs(arr[i]-arr[i+1]);
            if(dif<min)
            {
                min=dif;
            }
        }
        return min;
    }
}

package leetcode;
import java.util.*;
public class paritysort {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mix[]=sorted(arr);
        System.out.println(Arrays.toString(mix));
    }
    static int[] sorted(int [] arr)
    {
        ArrayList<Integer> first=sorting(arr,true);
        ArrayList<Integer> second=sorting(arr,false);
        second.addAll(first);
        int mix[]=new int[second.size()];
        for(int i=0;i<mix.length;i++)
        {
            mix[i]=second.get(i);
        }
        return mix;


    }
   private static ArrayList<Integer> sorting(int arr[] ,boolean b)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int low=0;
        int high=arr.length-1;
        if(b)
        {
            while(low<=high)
            {
                if( (arr[low]& 1)==1 )
                {
                    list.add(arr[low]);
                }
                low++;
            }
        }
        else
        {
            while(low<=high)
            {
                if( ((arr[low] & 1)!=1))
                {
                    list.add(arr[low]);
                }
                low++;
            }

        }
        return list;


    }
}

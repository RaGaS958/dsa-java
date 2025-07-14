package leetcode;

import java.util.*;

public class intervalsmerge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        System.out.print("enter intervals in array:-");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> list=interval(arr);
        System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>> interval(int arr[][])
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ArrayList<Integer> sub=new ArrayList<>();

            if( i<arr.length-1 && arr[i][1]>=arr[i+1][0])
            {
                sub.add(arr[i][0]);
                sub.add(arr[i+1][1]);
                list.add(sub);
                i++;
            }
            else{
                sub.add(arr[i][0]);
                sub.add(arr[i][1]);
                list.add(sub);
            }
        }

        return list;
    }
}

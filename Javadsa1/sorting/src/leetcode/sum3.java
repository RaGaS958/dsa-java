package leetcode;

import java.util.*;

public class sum3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> res=count(arr);
        System.out.println(res);
    }
    static ArrayList<ArrayList<Integer>> count(int arr[])
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int sum=arr[s]+arr[e];
            for(int i=s+1;i<e;i++)
            {
                if(arr[i]+sum==0)
                {
                    ArrayList<Integer> sublist=new ArrayList<>();
                    sublist.add(arr[s]);
                    sublist.add(arr[i]);
                    sublist.add(arr[e]);
                    list.add(sublist);


                }

            }
            if(sum<0) {
                s++;
            }
            else
        {

                e--;
            }

        }
        return list;
    }
}

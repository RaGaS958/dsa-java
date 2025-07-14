package leetcode;

import java.util.*;

public class specialarrayX {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=specialX(arr);
        System.out.println(x);
    }
    static int specialX(int arr[])
    {
        Arrays.sort(arr);
        int x=1;
         int k=0;
         while(k<arr.length)
         {
             if(arr[k]<x)
             {
                 k++;
             }
             else
             {
                 if(arr.length-k==x)
                 {
                     return x;
                 }
                 else
                 {
                     x++;
                 }

             }


         }
         return -1;
    }
}

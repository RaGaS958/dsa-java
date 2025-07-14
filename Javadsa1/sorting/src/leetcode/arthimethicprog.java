package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class arthimethicprog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int r=arr[1]-arr[0];
        boolean cond=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]!=r)
            {
                cond=false;
                break;
            }
        }

        System.out.println(cond);
    }
}

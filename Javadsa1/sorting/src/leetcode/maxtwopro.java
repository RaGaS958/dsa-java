package leetcode;

import java.util.*;

public class maxtwopro {
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
        int max=(arr[arr.length-1]-1)*(arr[arr.length-2]-1);
        System.out.println(max);
    }
}

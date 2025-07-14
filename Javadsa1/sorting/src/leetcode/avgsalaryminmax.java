package leetcode;

import java.util.*;

public class avgsalaryminmax {
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
        int sum=0;
        for(int i=1;i<arr.length-1;i++)
        {
            sum=sum+arr[i];
        }
        double avg=sum/(arr.length-2);
        System.out.println(avg);
    }
}

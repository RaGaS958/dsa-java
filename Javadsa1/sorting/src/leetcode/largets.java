package leetcode;

import java.util.Scanner;

public class largets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String c=count(arr);
        System.out.println(c);
    }
    static String count(String []arr)
    {
        StringBuilder s=new StringBuilder();
        int size=0;


    }
}

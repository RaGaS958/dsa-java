package leetcode;

import java.util.*;

public class mismatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c[] =count(arr);
        System.out.println(Arrays.toString(c));
    }
    static int[] count(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{0};
    }
}

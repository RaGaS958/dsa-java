package leetcode;

import java.util.*;

public class containduplicate {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of  array=");
        int n = sc.nextInt();
        System.out.print("Enter numbers in array :-");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate:-"+check(arr));
    }
    static boolean check(int arr[])
    {
        Arrays.sort(arr);
        int k=0;
        while(k<arr.length-1 )
        {
            if(arr[k]==arr[k+1] )
            {
                return true;
            }
            k++;


        }
        return false;
    }
}

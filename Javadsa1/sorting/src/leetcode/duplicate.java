package leetcode;

import java.util.*;

public class duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c=count(arr);
        System.out.println(c);
    }
    static int count(int arr[])
    {
        int res[]=new int[arr.length];
        res[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res[i]=arr[i];

            if(check(res,i))
            {
                return arr[i];
            }
        }
        return -1;
    }
    static boolean check(int res[],int pos)
    {
        for(int i=pos;i>0;i--)
        {
            if(res[i]<res[i-1])
            {
                int temp=res[i];
                res[i]=res[i-1];
                res[i-1]=temp;
            }
            else if (res[i]==res[i-1])
            {
                return true;
            }
        }
        return false;
    }
}

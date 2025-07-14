package leetcode;


import java.util.*;

public class Maxpro3 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(maxpro(arr));
    }
    static int maxpro(int arr[])
    {
        int s=0;
        int e=arr.length-1;
        int p=1;
        int count=3;
        while( count>0 && s<=e)
        {
        if(Math.abs(arr[s])>Math.abs(arr[e]))
        {
            p*=arr[s];
            s++;
        }
        else
        {
            p*=arr[e];
            e--;

        }
        count--;

        }
        return p;
    }
}

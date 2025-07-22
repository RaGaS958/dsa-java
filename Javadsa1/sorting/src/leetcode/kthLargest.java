package leetcode;

import java.util.*;

public class kthLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the largest pos=");
        int k=sc.nextInt();
        int c=largest(arr,k);
        System.out.println(c);
    }
    static int largest(int arr[],int k)
    {
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        if(k>1) {

            k=k-1;
            while (k > 0) {
              int maxpos=-1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]>maxpos && arr[i]<max)
                    {
                        maxpos=arr[i];
                    }
                }
                max=maxpos;
                int occ=occ(arr,max);
                if(occ-1>=k)
                {
                    return max;
                }
                k=k-occ;
            }
        }

        return max;
    }
    static int occ(int arr[],int tar)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                c++;
            }
        }
        return c;

    }

}

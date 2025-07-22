package leetcode;

import java.util.*;

public class missingpositive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c=miss(arr);
        System.out.println(c);
    }
    static int miss(int arr[])
    {
       Arrays.sort(arr);
       if(arr[0]>1)
       {
           return 1;
       }

       for(int i=0;i<arr.length-1;i++) {
           if (arr[i] >= 0) {

               if (arr[i] + 1 != arr[i + 1]) {
                   return arr[i] + 1;
               }
           }
           else
           {
               if(arr[i+1]<0 || arr[i+1]==1 || arr[i+1]==0 )
               {
                   continue;
               }
               else
               {
                   return 1;
               }
           }
       }
        return arr[arr.length-1]+1;
    }
}

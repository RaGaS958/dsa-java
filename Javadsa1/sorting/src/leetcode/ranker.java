package leetcode;

import java.util.*;

public class ranker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       ranking(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ranking(int arr[])
    {
        int sorted[]=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(sorted);
        int k=1;
        for ( int s: sorted)
        {
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]==s)
              {
                  arr[i]=k;
              }
          }
          k++;
        }

    }
}

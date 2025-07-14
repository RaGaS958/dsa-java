package leetcode;

import java.util.*;

public class heightschool {
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
    static int count(int [] arr)
    {
        int c=0;
      int exp[]=Arrays.copyOfRange(arr,0,arr.length);
      Arrays.sort(exp);
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]-exp[i]!=0)
          {
              c++;
          }
      }

        return c;
    }
}

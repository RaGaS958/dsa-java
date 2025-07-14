package leetcode;

import java.util.*;

public class sum3close
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target ");
        int tar=sc.nextInt();
        System.out.println(count(arr,tar));
    }
    static int  count(int arr[],int tar)
    {
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        int min=11111;
        while(s<e)
        {
            if(e-s>1)
            {
                min=11111;

            }

            int sum=arr[s]+arr[e];
            for(int i=s+1;i<e;i++)
            {
              if(sum+arr[i]<min)
              {
                  min=sum+arr[i];
              }

            }

            if(min>tar)
            {
                e--;
            }
            else if(min<tar)
            {

                s++;
            }
            else
            {
                return min;
            }

        }
        return min;
    }
}

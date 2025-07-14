package leetcode;

import java.util.*;

public class NumberSmallerThan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Smaller(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Smaller(int arr[])
    {
        int res[]=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(res);
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<res.length;j++ )
            {
                if( res[j] < arr[i])
                {
                    count++;
                }
                else if(res[j]>arr[i])
                {
                    break;
                }
                else
                {
                    continue;
                }
            }
            arr[i]=count;
        }

    }
}

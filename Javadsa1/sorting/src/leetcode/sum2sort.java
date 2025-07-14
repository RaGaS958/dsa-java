package leetcode;
import java.util.*;
public class sum2sort {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        System.out.print("enter elements in array:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Target=");
        int tar=sc.nextInt();
        int res[]=sum2(arr,tar);
        System.out.println(Arrays.toString(res));

    }
    static int search(int element,int arr[] )
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;


    }
    static int[] sum2(int res[],int tar)
    {
        int arr[]=Arrays.copyOfRange(res,0,res.length);
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            if(arr[s]+arr[e]==tar)
            {
                return new int[]{search(arr[s],res),search(arr[e],res)};
            }
            else
            {

                if(arr[e]+arr[s]>tar)
                {
                    e--;
                }
                else if(arr[e]+arr[s]<tar)
                {
                    s++;
                }

            }
        }
        return new int[]{-1};
    }

}

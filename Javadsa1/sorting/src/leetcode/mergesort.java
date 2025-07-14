package leetcode;
import java.util.*;
public class mergesort {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array");
        int n=sc.nextInt();
        System.out.print("Enter numbers in first array in ascending order:-");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of Second array");
        int m=sc.nextInt();
        System.out.print("Enter numbers in Second array in ascending order:-");
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int [] merged=merger(arr1,n,arr2,m);
        System.out.println(Arrays.toString(merged));

    }
    static int[]  merger(int arr1[],int n,int arr2[],int m)
    {
        int merge[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                merge[k]=arr1[i];
                i++;

            }
            else
            {
                merge[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            merge[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            merge[k]=arr2[j];
            j++;
            k++;
        }
        return merge;
    }
}

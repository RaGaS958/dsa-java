package leetcode;
import java.util.*;
public class max3distinct {
    public static void main (String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n=sc.nextInt();
        int arr []=new int [n];
        System.out.print("Enter the elements of array:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max[]=maxx(arr);
        System.out.println(Arrays.toString(max));

    }
    private static void sortdes(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else {
                    break;
                }
            }
        }
    }
    static int[] maxx(int arr[])
    {
        sortdes(arr);
        int point=0;
        int max[]=new int [3];
        int pos=0;
        while(point<arr.length && pos<max.length)
        {
            if(point<arr.length-1 && arr[point]==arr[point+1])
            {
                point++;
            }
            else
            {
                max[pos]=arr[point];
                point++;
                pos++;
            }
        }
        return max;
    }
}

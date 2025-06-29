
import java .util.*;

public class selectionsort {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array = ");
        int n=sc.nextInt();
        System.out.print("Enter the elements in array:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Count ="+selectionsort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int selectionsort(int arr[])
    {
        int count =0;
        for(int i=arr.length-1;i>0;i--)
        {
            int max=arr[0];
            int maxindex=0;
            for(int j=0;j<i;j++)
            {
               if(max<arr[j])
               {
                   max=arr[j];
                   maxindex=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[maxindex];
            arr[maxindex]=temp;
            ++count;

        }
        return count;
    }
}

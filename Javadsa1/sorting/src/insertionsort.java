
import java.util.*;
public class insertionsort {
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
        System.out.println("Count ="+insertionsort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int insertionsort(int arr[])
    {
        int count =0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    ++count;
                }
                else
                {
                    break;
                }
            }
        }
        return count;
    }
}

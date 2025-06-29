import java .util.*;
public class bubblesort
{
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
        System.out.println("Count ="+bubblesort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int bubblesort(int arr[])
    {
        int count =0;
        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    ++count;
                }
            }
        }
        return count;
    }

}

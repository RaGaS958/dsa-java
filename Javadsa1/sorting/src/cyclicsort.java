import java.util.*;

public class cyclicsort {
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
        System.out.println("Count ="+cyclicsort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int cyclicsort(int arr[])
    {
        int count =0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=arr[arr[i]])
            {
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
                ++count;
            }

        }
        return count;
    }
}

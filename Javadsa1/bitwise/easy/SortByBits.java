import java.util.*;
public class SortByBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.print("Enter the num in array:-");
        int [][]arr=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
        }
        sorting(arr);
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i< arr.length;i++)
        {
            list.add(arr[i][0]);

        }
        System.out.println("Sorted array is"+list);

    }
    static void sorting(int [][]arr)
    {
        count(arr);
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j][1]<arr[j-1][1])
                {
                    int temp=arr[j][0];
                    arr[j][0]=arr[j-1][0];
                    arr[j-1][0]=temp;
                    temp=arr[j][1];
                    arr[j][1]=arr[j-1][1];
                    arr[j-1][1]=temp;
                }
            }
        }

    }
    static void  count(int [][]arr )
    {
        for(int i=0;i< arr.length;i++)
        {

            while(arr[i][0]>0)
            {
                if((arr[i][0] &1) ==1)
                {
                    arr[i][1]+=1;
                    arr[i][0]=arr[i][0]>>1;
                }
            }
        }
    }
}

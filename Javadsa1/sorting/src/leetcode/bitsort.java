package leetcode;
import java.util.*;
public class bitsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bitCountSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void bitCountSort(int arr[])
    {
        Arrays.sort(arr);
      for(int i=0;i<arr.length-1;i++)
      {
          for(int j=i+1;j>0;j--)
          {
              if(countbit(arr[j-1])>countbit(arr[j]))
              {
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
              }
              else
              {
                  break;
              }
          }
      }


    }
    private static int countbit(int num)
    {
        int count=0;
        while(num !=0)
        {
            count+=(num&1);
            num=num>>1;

        }
        return count;
    }
}

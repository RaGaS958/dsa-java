package leetcode;
import java .util.*;
public class largest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String max=largestNum(arr);
        System.out.println(max);
    }
    static String largestNum(int arr[])
    {
        StringBuilder s=new StringBuilder();
        int size=maxsize(arr);
        while(size>0) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j > 0; j--) {
                    int first = arr[j - 1] % 10;
                    int second = arr[j] % 10;
                    if (first < second) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
            size/=10;
        }
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]);
            }
         System.out.println(Arrays.toString(arr));
        return s.toString();
    }
 private static int maxsize(int arr[])
 {
     int max=-1;
     for(int i=0;i<arr.length;i++)
     {
         if(max<arr[i])
         {
             max=arr[i];
         }
     }
       int size=(int)Math.log10(max)+1;

  return size;
 }
}

package leetcode;
import java.util.*;
public class majorityelement {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of  array=");
        int n=sc.nextInt();
        System.out.print("Enter numbers in array :-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
     System.out.println("Majority is "+major(arr)[0]+ " which appears "+major(arr)[1]+" times" );
    }
    static int[] major(int arr[]) {
      Arrays.sort(arr);
      int max=0;
       int k=0;
       int maxele=arr[0];
       int c=1;
       while(k<arr.length)
       {

           if(k<arr.length-1 && arr[k]==arr[k+1])
           {
               c++;
               k++;
           }
           else
           {
               if(c>max) {
                   max = c;
                   maxele = arr[k];
                   k++;
                   c=1;
               }
           }

       }
        return new int[] {maxele,max};
    }
}

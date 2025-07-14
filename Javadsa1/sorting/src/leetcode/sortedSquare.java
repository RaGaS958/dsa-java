package leetcode;
import java.util.*;
public class sortedSquare {
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array=");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.print("enter elements in array:-");
     for(int i=0;i<n;i++)
     {
         arr[i]= sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
         arr[i]=arr[i]*arr[i];
     }
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
 }

}

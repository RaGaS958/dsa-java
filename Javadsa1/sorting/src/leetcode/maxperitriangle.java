package leetcode;
import java.util.*;
public class maxperitriangle {
public static void main(String args [])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array=");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter sides of triangle:-");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(maxperimeter(arr));

}
private static boolean max(int a,int b,int c) {
    if (a + b > c && a+c>b && b+c>a) {
        return true;
    }  else {
      return  false;
    }
}

static int maxperimeter(int arr[])
{
    Arrays.sort(arr);
    for(int i=arr.length-1;i>1;i--)
    {
        if(max(arr[i],arr[i-1],arr[i-2]))
        {
            return arr[i]+arr[i-1]+arr[i-2];
        }

}
return 0;

}
}
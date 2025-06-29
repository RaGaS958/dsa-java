import java.util.*;
public class RecursionBinarySearch
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.print("Enter elements in the array:-");
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
         System.out.print("Enter the searching element:-");
         int k=sc.nextInt();
         int check=search(arr,0,arr.length-1,k);
         System.out.println((check==1)?"Found":"NotFound");

    }
       static int search(int []arr,int s,int e,int k)
       {
           if(s>e)
               return -1;
           int m=s+(e-s)/2;
            if(arr[m]==k)
                return 1;
            else if( arr[m]>k )
                return search(arr,s,m-1,k);
           else
               return search(arr,m+1,e,k);
       }
}

import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3,4};
        int x=6;
        System.out.println("The target is at:-"+search(arr,x,0,arr.length-1));
    }
    static int search(int arr[],int x,int s,int e)
    {
        if(s>e)
        {
            return -1;

        }
        int m=s+(e-s)/2;
        if(arr[m]==x)
        {
            return m;
        }
        else if(arr[s]<arr[m])
        {
            if(x<arr[m] && x>=arr[s])
            {
                return search(arr,x,s,m-1);
            }
            else
            {
                return search(arr,x,m+1,e);
            }
        }
        else
        {
            if(x<=arr[e] && x>arr[m])
            {
                return search(arr,x,m+1,e);
            }
            else
            {
                return search(arr,x,s,m-1);
            }
        }
    }
}

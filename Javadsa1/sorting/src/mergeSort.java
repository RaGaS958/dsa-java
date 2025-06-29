import java .util.*;
public class mergeSort {
    static int[] mergesort(int [] arr)
    {
        if(arr.length==1)
        {
            return arr  ;
        }
        int mid= arr.length/2;
        int [] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right =mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int [] left,int [] right)
    {
        int [] merged=new int [left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&& j<right.length)
        {
            if(left[i]>right[j])
            {
                merged[k]=right[j];
                j++;
            }
            else if(left[i]<right[j])
            {
                merged[k]=left[i];
                i++;
            }
            k++;
        }

            while(i<left.length)
            {
                merged[k++]=left[i++];
            }


            while(j<right.length)
            {
                merged[k++]=right[j++];
            }

        return merged;
    }
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);
        int arr []={4,3,2,1,5,8,6,7};
        int ar[]=mergesort(arr);
        System.out.println(Arrays.toString(ar));
    }

}

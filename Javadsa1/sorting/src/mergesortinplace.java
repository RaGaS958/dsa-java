import java .util.*;
public class mergesortinplace {
    static void mergesort(int [] arr,int s,int e)
    {
        if((e-s)==1)
        {
            return  ;
        }
        int mid= (e+s)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid,e);
         merge(arr,s,e,mid);
    }
    private static void merge(int [] arr,int s,int e,int mid)
    {
        int [] merged=new int [e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e)
        {
            if(arr[i]>arr[j])
            {
                merged[k]=arr[j];
                j++;
            }
            else if(arr[i]<arr[j])
            {
                merged[k]=arr[i];
                i++;
            }
            k++;
        }

        while(i<mid)
        {
            merged[k]=arr[i];
            k++;
            i++;
        }


        while(j<e)
        {
            merged[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<merged.length;l++)
        {

            arr[s+l]=merged[l];
        }
    }
    public static void main(String args [])
    {
        int arr []={4,3,2,1,5,8,6,7};
        mergesort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}

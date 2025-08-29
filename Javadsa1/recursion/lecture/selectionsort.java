import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};
        sort(arr,arr.length-1,0,arr[0],0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[],int i,int j,int max,int index)
    {
        if(i<1)
        {
            return;
        }
        if(j<=i)
        {
            if(arr[j]>max)
            {
                max=arr[j];
                index=j;
            }
            sort(arr,i,j+1,max,index);
        }
        else
        {
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            sort(arr,i-1,0,arr[0],0);

        }
    }
}

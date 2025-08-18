public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,77,88,100};
        System.out.println("Find at "+pos(arr,0,arr.length-1));

    }
    static int pos(int arr[],int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==88)
        {
            return mid;
        }
        else if(arr[mid]>88)
        {
         return    pos(arr,s,mid-1);

        }
        else
        {
           return  pos(arr,mid+1,e);
        }
    }
}

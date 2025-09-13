import java.util.Arrays;

public class sum_triangle {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    display_sumTri(arr);
    }
    static void display_sumTri(int arr[])
    {
        if(arr.length==1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int a[]=new int[arr.length-1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=arr[i]+arr[i+1];
        }
        display_sumTri(a);
        System.out.println(Arrays.toString(arr));
        return;
    }

}

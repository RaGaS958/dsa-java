import java.util.*;
public class LinearSeach {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7,4,5};
        int x=8;
        System.out.println("the element is found:-"+find(arr,x,0));

    }
    static boolean find(int arr[],int x,int i)
    {
        if(i==arr.length-1)
        {
            return false;
        }
        return arr[i]==x || find(arr,x,i+1);
    }
}

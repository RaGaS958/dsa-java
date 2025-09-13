import java.util.ArrayList;

public class min_max {
    public static void main(String[] args) {
        int arr[]={1,4,3,-5,-4,8,6};
        System.out.println(display_max(arr));
        System.out.println(display_min(arr));
    }
    static int display_max(int [] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }
        int max=arr[0];
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
            }
        }
        if(list.size()==0)
        {
            list.add(max);
        }
       int a[]=new int[list.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=list.get(i);
        }
        return display_max(a);
    }
    static int display_min(int [] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }
        int min=arr[0];
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                list.add(arr[i]);
            }
        }
        if(list.size()==0)
        {
            list.add(min);
        }
        int a[]=new int[list.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=list.get(i);
        }
        return display_min(a);
    }
}

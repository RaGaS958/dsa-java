import java.util.*;
public class LinearSearch1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,6,8,8,2};
        int x=8;
        System.out.println("Elements find at:-"+find(arr,x,0));

    }
    static ArrayList find(int arr[],int x,int i)
    {
        ArrayList<Integer> list =new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if(arr[i]==x) {
            list.add(i);
        }
        ArrayList<Integer> upcoming=find(arr,x,i+1);
        list.addAll(upcoming);
        return list;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum2 {
    public static void main(String[] args) {
        int target=8;
        ArrayList<Integer> list=new ArrayList<>();
         int arr[]={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        System.out.println(combinationalSum2(list,target, arr,0));
    }
    static ArrayList<ArrayList<Integer>> combinationalSum2(ArrayList<Integer> list,int target,int arr[],int start)
    {
        ArrayList<ArrayList<Integer>> outerlist=new ArrayList<>();
        if(sum(list)==target)
        {

            outerlist.add(list);
            return outerlist;
        }
        for(int i=start;i<arr.length;i++)
        {
            ArrayList<Integer> inner=new ArrayList<>();
            inner.addAll(list);
            inner.add(arr[i]);
         outerlist.addAll(combinationalSum2(inner,target,arr,i+1));
        }
        return outerlist;

    }
    static int sum(ArrayList<Integer> list)
    {
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+= list.get(i);
        }
        return sum;
    }
}

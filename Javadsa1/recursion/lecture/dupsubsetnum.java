import java.util.ArrayList;
import java.util.Arrays;

public class dupsubsetnum {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        ArrayList<ArrayList<Integer>> list=sub(arr);
        System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>> sub(int arr[])
    {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());
        int start;
        int end;
        for(int i=0;i<arr.length;i++)
        {
             start=0;
            end=outer.size();
            if(i>0 && arr[i-1]==arr[i])
            {
                start=end/2;
            }
            for(int j=start;j<end;j++)
            {
                ArrayList<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}

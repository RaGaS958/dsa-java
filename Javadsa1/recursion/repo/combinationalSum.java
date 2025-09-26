import java.util.ArrayList;

public class combinationalSum {
    public static void main(String[] args) {
       int arr[]={2,3,5};
       comb(arr,8,new ArrayList<>(),0);
    }
    static void comb(int arr[],int tar,ArrayList<Integer> list,int index)
    {
        if(sum(list,tar))
        {
            System.out.println(list);
        }
        int sum=0;
        for(int j=0;j<list.size();j++)
        {
            sum=sum+list.get(j);
        }
        for(int i=index;i<arr.length;i++)
        {
            if(sum+arr[i]<=tar)
            {
                list.add(arr[i]);
                comb(arr,tar,list,i);
                list.remove(list.size()-1);
            }
            else
            {
                continue;
            }
        }
        return;
    }
    static boolean sum(ArrayList<Integer> list ,int tar)
    {
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        if(sum==tar)
        {
            return true;
        }
        return false;
    }

}

import java.util.ArrayList;

public class DivisibleSubsets {
    public static void main(String[] args) {
        int n=2;
        int set[]={4,6,10};
        checkDivisble(n,set,new ArrayList<>(),0);
    }
    static void checkDivisble(int n, int set[], ArrayList<Integer> list,int st)
    {
        if(sum(list,n))
        {
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(st);

        }
        int size=0;
        for(int i=st;i< set.length;i++)
        {
            list.add(set[i]);
              checkDivisble(n,set,list,i+1);
            list.remove(list.size()-1);

        }

    }
    static boolean sum(ArrayList<Integer> list,int n)
    {
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+= list.get(i);
        }
        if( sum!=0 && sum%n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

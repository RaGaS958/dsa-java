import java.util.ArrayList;

public class conseN {
    public static void main(String[] args) {
        int n=2;
        consSeq(n,((int)Math.pow(10,n-1)),new ArrayList<>());
    }
    static void consSeq(int limit,int startpos,ArrayList<Integer> list)
    {
        if(((int)Math.log10(startpos)+1)==(limit+1))
        {
            System.out.println(list);
            return;
        }
        if(check(startpos,limit))
        {
            list.add(startpos);

        }
        consSeq(limit,startpos+1,list);

    }
    static boolean check(int num,int size)
    {
        int start=num;
        int end=0;
        while(num>0)
        {
            int r=num%10;
            end=(end*10)+r;
            num/=10;
        }

        return true;

    }
}

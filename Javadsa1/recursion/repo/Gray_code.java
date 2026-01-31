import java.util.ArrayList;
import java.util.List;

public class Gray_code {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(0,1));
        graycode(list,4);
    }
    static void graycode(ArrayList<Integer> list,int n)
    {
        if(n==1)
        {
            System.out.println(list);
            return;
        }
        int size=list.size();
        for(int i=0;i<size;i++)
        {
            list.add(reflected(list.get(i)));
        }
        graycode(list,n-1);

    }
    static int reflected(int num)
    {
        int result=0;
        int bitsize=(Integer.toBinaryString(num)).length();
        for(int i=0;i<bitsize;i++)
        {
            if((num & (1<<i))!=0)
            {
                result|=1<<(bitsize-1-i);
            }
        }
        return result;
    }
}

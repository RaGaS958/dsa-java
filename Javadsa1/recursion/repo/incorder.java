import java.util.ArrayList;

public class incorder {
    public static void main(String[] args) {
        int n = 3;
        int num = (int) Math.pow(10, n - 1);
        ArrayList<Integer> list = inorder(n, num);
        System.out.println(list);
    }
    static ArrayList<Integer> inorder(int n,int num)
    {
        if(num>((int)Math.pow(10,n)))
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> outer=new ArrayList<>();
        if(check(num))
        {
            outer.add(num);
        }
        outer.addAll(inorder(n,num+1));
        return outer;
    }
    static boolean check(int num)
    {
        int start=num%10;
        num=num/10;
        int end=0;
        while(num>0)
        {
            end=num%10;
            if(start<=end)
            {
                return false;
            }
            start=end;
            num=num/10;
        }
        return true;
    }

}




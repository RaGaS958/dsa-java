import java.util.*;
public class alternateBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.println("Output:-"+alter(n));
    }
    static  boolean alter(int n)
    {
        int prev=~(n&1);
        while(n>0)
        {
            if(prev == (n&1))
            {
                return false;
            }
            prev=n&1;
            n=n>>1;

        }
        return true;
    }
}

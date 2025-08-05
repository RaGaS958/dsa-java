import java.util.*;
public class ReduceToZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.println("Ways to reduce it to zero is "+reduce(n));

    }
    static int reduce(int n)
    {
        int c=0;
        while(n>0)
        {
            if((n & 1)==1)
            {
                n=n-1;
            }
            else
            {
                n=n>>1;
            }
            c++;
        }
        return c;
    }
}

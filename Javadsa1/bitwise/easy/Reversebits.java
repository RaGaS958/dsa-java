import java.util.*;

public class Reversebits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter the Number=");
         int n=sc.nextInt();
         System.out.println("Num is "+Integer.toString(n,2));
         System.out.println("Reverse num is "+reverse(n));
        System.out.println("Reverse Bit is "+Integer.toString(reverse(n),2));

    }
    static int reverse(int n)
    {
        int num=0;
        for(int i=1;i<=32;i++)
        {
            if((n & 1) ==1)
            num=num+(int)Math.pow(2,(32-i));
            String s=Integer.toString(n,2);
            n=n>>1;
        }
        return num;
    }
}

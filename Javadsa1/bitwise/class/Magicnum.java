import java.util.*;
public class Magicnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.printf("%dth magic number is %d",n,magic(n));
    }
    static int magic(int n)
    {
        int sum=0;
        int i=1;
        while(n!=0)
        {
            if((n & 1) ==1)
            {
                sum=sum+(int)Math.pow(5,i);

            }


                i++;
                n=n>>1;

        }
        return sum;
    }
}

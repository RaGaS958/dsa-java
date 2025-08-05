import java.util.*;
public class addBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Binary=");
        String a=sc.next();
        System.out.print("Enter the Second Binary=");
        String b=sc.next();
        System.out.printf("Sum of %s and %s is %s",a,b,sum(a,b));

    }
    static String sum(String a,String b)
    {
        int first=val(a);
        int second=val(b);
        int value=first + second;
        return Integer.toString(value,2);

    }
    static int val(String s)
    {
        int i=0;
        int sum=0;
        while(i<s.length())
        {
            if(s.charAt(s.length()-1-i)=='1')
            {
                sum=sum+((int)Math.pow(2,i));
            }
            i++;
        }
        return sum;
    }
}

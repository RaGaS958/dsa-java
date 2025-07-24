import java.util.*;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.printf("Num is %s",check(n));
    }
    static String check(int num)
    {
        if((num & 1) ==1)
        {
            return "ODD";
        }
        else
        {
            return "EVEN";
        }
    }

}

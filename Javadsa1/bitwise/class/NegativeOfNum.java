import java.util.*;
public class NegativeOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.printf("Negative of %d is %d",n,negative(n));
    }
    static int negative(int n)
    {
        n=~n+1;
        return n;
    }
}

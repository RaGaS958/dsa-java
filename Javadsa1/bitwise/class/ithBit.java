import java.util.*;
public class ithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int num=sc.nextInt();
        System.out.print("Enter the ith position to be found=");
        int i=sc.nextInt();
        System.out.printf("the %dth position of %s is %s",i,Integer.toString(num,2),post(num,i));
    }
    static  String post(int num,int i)
    {
        return Integer.toString((num &(1<<i-1)),2);
    }
}

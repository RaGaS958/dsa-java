
import java.util.*;
public class resetbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num=");
        int num=sc.nextInt();
        System.out.print("Position to be reset=");
        int i=sc.nextInt();
        System.out.printf("Old num is %s\nNew Num is %s",Integer.toString(num,2),resetbit(num,i));

    }
    static String resetbit(int num,int i)
    {
        int set=1<<(i-1);
        int reset=~set;
        return Integer.toString( num & reset,2);

    }
}

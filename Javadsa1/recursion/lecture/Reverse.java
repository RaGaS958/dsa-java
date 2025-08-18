import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse:-"+reverse(12345));
    }
    static int reverse(int num)
    {
        if(num%10==num)
            return num;
        int l=(int)(Math.log10(num));
        return ((num%10)*((int)Math.pow(10,l)))+reverse(num/10);
    }
}

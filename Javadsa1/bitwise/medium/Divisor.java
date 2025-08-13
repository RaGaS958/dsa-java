import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Dividend=");
        int dividend=sc.nextInt();
        System.out.print("Enter the Divisor=");
        int divisor=sc.nextInt();
        int result[]=result(dividend,divisor);
        System.out.println("remainder ="+result[0]);
        System.out.println("Quotient ="+result[1]);
    }
    static int[] result(int dividend,int divisor)
    {
        boolean check=false;
        if(divisor<0)
        {
            check=true;
            divisor=(~divisor) +1;
        }
        int qoutirnt=0;
        int remainder=dividend;
        while(remainder>=divisor)
        {
            int shift=0;

            while((divisor<<shift)<=remainder)
            {

                shift++;
            }
            remainder-=(divisor<<shift-1);
            qoutirnt |=(shift);

        }
        return new int[]{remainder,check ? (~qoutirnt)+1 :qoutirnt};
    }
}

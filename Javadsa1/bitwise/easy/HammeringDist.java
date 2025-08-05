import java.util.*;
public class HammeringDist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first Num= ");
        int a=sc.nextInt();
        System.out.print("Enter the first Num= ");
        int b=sc.nextInt();
        System.out.println("hammering dist ="+hammer(a,b));
    }
    static  int hammer(int a,int b)
    {
        int count=0;
        int size_a=Integer.toString(a,2).length();
        int size_b=Integer.toString(b,2).length();
         if(size_a==size_b)
         {
             for(int i=0;i<size_a;i++)
             {
                 if((a & 1) != (b&1))
                 {
                     ++count;
                 }
                 a=a>>1;
                 b=b>>1;
             }
         }
         else {
             int min=Math.min(size_a,size_b);
             for(int i=0;i<min;i++)
             {
                 if((a & 1) != (b&1))
                 {
                     ++count;
                 }
                 a=a>>1;
                 b=b>>1;
             }
              while(a>0)
              {
                  if((a & 1) ==1) {
                      count++;
                  }
                 a= a>>1;
              }
             while(b>0)
             {
                 if((b & 1) ==1) {
                     count++;
                 }
                 b= b>>1;
             }
         }

        return count;
    }
}

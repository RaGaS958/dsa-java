import java.util.*;
public class XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n=");
        int n=sc.nextInt();
        System.out.print("Enter the start=");
        int start=sc.nextInt();
        System.out.println("the output is "+xor(n,start));
}
static int xor(int n,int s)
{
    int val=0;
    for(int i=0;i<n;i++)
    {
      val=val^(s+(2*i))  ;
    }
    return val;
}
}

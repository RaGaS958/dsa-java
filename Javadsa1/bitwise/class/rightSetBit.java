import java.util.*;
public class rightSetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Num");
        int n=sc.nextInt();
        System.out.printf("Right most Set bit of %s is at %d ",Integer.toString(n,2),setBit(n));

    }
    static int setBit(int n)
    {
        int count=1;

        while((n & 1) !=1 )
        {
            n=n>>1;
            count++;
        }
        return count;
    }
}

import java.util.*;
public class BinaryGap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println("the longest dist is "+dist(n));

    }
    static int dist(int n)
    {
        int max=0;
        while(n>0)
        {
            if(Integer.toString(n,2).length()==1)
            {
                break;
            }

            else if((n & 1)==1)
            {
                int c=0;
                while((n & 1) ==1)
                {
                    n=n>>1;
                }

                while((n & 1) ==0)
                {
                    c++;
                    n=n>>1;

                }

                max=Math.max(max,c);
            }
            else
            {
                n=n>>1;
            }
        }
        if(max>0) {
            return max+1;
        }
    else
        {
            return 0;
        }
    }
}

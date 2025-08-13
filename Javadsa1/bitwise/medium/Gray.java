import java.util.*;
public class Gray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println("Gray code:-"+grayCode(n));
    }
    static ArrayList<Integer> grayCode(int n)
    {
        ArrayList<Integer> list =new ArrayList<>();
               list.add(0);
               for(int i=1;i<n+1;i++)
               {
                   int num=(list.get(i-1)<<1) | 1;
                   list.add(num);
               }
               int shift=0;
               for(int i=n;i<n*2;i++)
               {

                   int num=list.get(i)^(1<<shift);
                   if(num==0)
                   {
                       break;
                   }
                  list.add(num);
                  shift++;
               }
        return list;
    }
}

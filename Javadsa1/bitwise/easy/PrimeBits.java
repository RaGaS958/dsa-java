import java.util.*;
public class PrimeBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter the list:-");
        while(sc.hasNextInt())
        {
            int n= sc.nextInt();
            list.add(n);
        }
        System.out.println("the number of prime bits number = "+primeBits(list));
    }
    static int primeBits(ArrayList<Integer> list)
    {
        int count=0;
        int j=0;
        while(j<list.size()) {
            int num = countBits(list.get(j));
            boolean check = true;
            if (num == 2) {
                count++;
            }
            else if (num>1) {
                for (int i = 2; i <= ((int) Math.sqrt(num)); i++)
                {
                    if (num % i == 0)
                    {
                        check = false;
                        break;
                    }
                }
                if (check)
                {
                    count++;
                }
            }
            j++;


        }
        return count;
    }
    static int countBits(int n)
    {
        int c=0;
        while(n>0)
        {
            if((n & 1) ==1)
            {
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}

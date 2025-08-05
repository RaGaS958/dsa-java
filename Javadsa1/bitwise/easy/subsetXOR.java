import java.util.*;

public class subsetXOR {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array:-");
        ArrayList<Integer> list =new ArrayList<>();
        while (sc.hasNextInt())
        {
            list.add(sc.nextInt());
        }
        System.out.print("OutPut is :-"+subXor(list));

    }
    static int subXor(ArrayList<Integer> list)
    {
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            int val=0;
            for(j=i;j<list.size();i++)
            {

            }
        }
        return sum;
    }
}

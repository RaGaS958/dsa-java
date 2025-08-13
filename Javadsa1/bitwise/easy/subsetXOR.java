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
        int it=(int)Math.pow(2,list.size());
        for(int i=0;i<it;i++)
        {
            int val=0;
            for(int j=0;j<list.size();j++)
            {
                if((i & (1<<j))!=0)
                {
                    val=val^list.get(j);
                }
            }
            sum=sum+val;

        }
        return sum;
    }
}

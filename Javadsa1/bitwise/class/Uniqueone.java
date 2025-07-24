import java.util.*;
public class Uniqueone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num =new ArrayList<>();
        System.out.print("Enter the value:-");
        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            num.add(n);
        }
        System.out.printf("Unique one is %d",unique(num));
    }
    static int unique(ArrayList<Integer> num)
    {
        int sum=0;
        for(int nums:num)
        {
            if(nums<0)
            {
                 nums=(~nums)+1;

            }
            sum=sum^nums;
        }
        return sum;
    }
}

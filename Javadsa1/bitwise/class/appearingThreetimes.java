import java.util.*;
public class appearingThreetimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements is array:-");
        ArrayList<Integer> list=new ArrayList<>();

        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            list.add(n);

        }
        System.out.printf("The singler is %d",founded(list));

    }
   private  static int maxLength(ArrayList<Integer> list)
   {
       int max=-1;
       for(int num:list)
       {
           if(max<num)
           {
               max=num;
           }
       }
       int i=1<<((int)Math.log10(max));
       int j=0;
       while(((int)Math.log10(i))<((int)(Math.log10(max))))
       {
           if((max & i) ==1)
           {
               return ((int)Math.log10(max))-j;
           }
           else {
               i=i>>1;
               j++;
           }
       }
       return -1;
   }
    static int founded(ArrayList<Integer> list)
    {
        int l=maxLength(list);

        int sum=0;
        int odd=0;
        for(int num : list)
        {
            sum=sum+num;
        }
        return sum%3;
    }
}

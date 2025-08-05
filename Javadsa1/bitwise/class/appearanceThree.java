import java.util.*;
public class appearanceThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers in the array :-");
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNextInt())
        {
            list.add(sc.nextInt());

        }
        System.out.printf("Odd one is %d",odd(list));
    }
    static int odd(ArrayList<Integer> list)
    {
       int sum=0;
       int max=-1;
       for(int i=0;i<list.size();i++)
       {
           max=Math.max(max,list.get(i));
       }
       int size=(int)Math.log(max)+2;
       int arr[]=new int[size];
       for(int nums:list)
       {
           int sizer=(int)Math.log(nums)+2;
           int i=0;
           while(i<sizer)
           {
             if((nums & 1) ==1)
             {
                 arr[i]+=1;
             }
             ++i;
             nums=nums>>1;
           }
       }
       for(int i=0;i<size;i++)
       {
           if(arr[i]%3!=0) {
               sum += 1 << i;
           }
       }
       return sum;
    }
}

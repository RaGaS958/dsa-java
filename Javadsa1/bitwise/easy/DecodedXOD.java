import java.util.*;
public class DecodedXOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First =");
        int f=sc.nextInt();
        System.out.print("Enter the Encoded Array:-");
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNextInt())
        {
            list.add(sc.nextInt());
        }

        System.out.println("Hidden Array is :-"+Arrays.toString(hidden(list,f)));
    }
    static int[] hidden(ArrayList<Integer> list ,int f)
    {
        int [] arr=new int[list.size()+1];
        arr[0]=f;
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=list.get(i-1) ^arr[i-1];
        }
        return arr;
    }
}

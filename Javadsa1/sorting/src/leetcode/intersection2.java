package leetcode;
import java.util.*;
public class intersection2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array:-");
        int n=sc.nextInt();
        System.out.print("Enter the elements in first array:-");
        int [] arr1=new int [n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of Second array:-");
        int m=sc.nextInt();
        System.out.print("Enter the elements in Second array:-");
        int [] arr2=new int [m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int res[];
        long st = System.nanoTime();
        if(n>m) {
            res = inter(arr1, arr2);
        }
        else
        {
            res=inter(arr2,arr1);
        }
        long ed = System.nanoTime();
        long time=ed-st;
        System.out.println("Intersected array :-"+Arrays.toString(res));
        System.out.println("Runtime:-"+time);


    }
    static int[] inter(int max[],int min[])
    {
        Arrays.sort(max);
        Arrays.sort(min);
        ArrayList<Integer> r=new ArrayList<>();
        int point=0;
        int pos=0;
        boolean check=false;
        while(point<min.length && pos<max.length)
        {

                for(int i=pos;i<max.length;i++)
                {
                    if(min[point]==max[i])
                    {
                        r.add(min[point]);
                        point++;
                        pos=i+1;
                        check=true;
                    }

                }

            if(check)
            {
                check=false;

            }
            else
            {
                ++point;
            }
        }
        int [] re =new int [r.size()];
        for(int i=0;i<re.length;i++)
        {
            re[i]=r.get(i);
        }


        return  re;
    }


}

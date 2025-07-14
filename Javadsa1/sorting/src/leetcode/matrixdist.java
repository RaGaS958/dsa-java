package leetcode;
import java.util.*;
public class matrixdist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows=");
        int r=sc.nextInt();
        System.out.print("Enter the columns=");
        int c=sc.nextInt();
        System.out.print("Enter the Crow=");
        int cr=sc.nextInt();
        System.out.print("Enter the Ccolumn = ");
        int cc=sc.nextInt();
        int arr[][]=new int[c*r][2];
        matrixdistance(arr,cr,cc, r, c);
        for(int i=0;i<c*r;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static void matrixdistance(int arr[][],int cr,int cc,int r,int c)
    {
        int k=0;
        int min= 0;
        int max=r+c-1;
        while(min<max)
        {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(Math.abs(i-cr)+Math.abs(cc-j) == min)
                {
                    arr[k][0]=i;
                    arr[k][1]=j;
                    k++;
                }
             }
        }
           min++;

        }

    }

}


import java.util.*;
public class flipMat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:-");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns:-");
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        System.out.print("Enter the elements in the array:-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("output:-"+flip(arr));

    }
    static int flip(int arr[][])
    {
        boolean check=false;
        int count=0;
        if(checkSame(arr))
        {
            return -1;
        }
        else
        {
            while(checkZero(arr))
            {
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<arr[0].length;j++)
                    {
                        if(arr[i][j]==1)
                        {

                            changeFlip(arr,i,j);
                            count++;

                        }
                    }

                }
            }
        }
        return count;
    }
    static boolean checkSame(int [][]arr)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j][i]!=arr[j+1][i])
                {
                    return false;
                }

            }
        }
        return true;
    }
    static boolean checkZero(int [][]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
        }
        if(sum==0)
        {
            return false;
        }
        else {
            return true;
        }
    }
    static void changeFlip(int [][]arr,int i,int j)
    {
        arr[i][j]=arr[i][j]^1;
        if(i<arr.length-1)
        {
            arr[i+1][j]=arr[i][j]^1;

        }
        if(i>0)
        {
            arr[i-1][j]=arr[i-1][j]^1;

        }
        if(j>0)
        {
            arr[i][j-1]=arr[i][j-1]^1;

        }
        if(j<arr[0].length-1)
        {
            arr[i][j+1]=arr[i][j+1]^1;

        }


    }

}

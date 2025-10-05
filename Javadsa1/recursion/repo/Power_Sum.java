public class Power_Sum {
    public static void main(String[] args) {
        int X=10;
        int n=2;
        System.out.println(count(X,n,0,1));
    }
    static int count(int X,int n,int sum,int start)
    {
        if(sum==X)
        {
            return 1;

        }
        else if (sum>X)
        {
            return 0;
        }
        int count =0;
        for(int i=start;i<X;i++)
        {
            sum=sum+(int)Math.pow(i,n);
            count+=count(X,n,sum,i+1);
            sum=sum-(int)Math.pow(i,n);
        }
        return count;
    }
}

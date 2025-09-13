public class special_fibonaaci {
    public static void main(String[] args) {
        int a=86;
        int b=77;
        int n=0;
        int ans=special(a,b,n);
        System.out.println(ans);
    }
    static int special(int a,int b,int n)
    {
        if(n<2)
        {
            if(n==1)
            {
                return b;
            }
            else
            {
                return a;
            }
        }
        return special(a,b,n-1) ^ special(a,b,n-2);
    }
}

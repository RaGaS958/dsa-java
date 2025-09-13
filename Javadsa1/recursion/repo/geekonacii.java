public class geekonacii {
    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=2;
        int n=5;
        int ans=geek(a,b,c,n);
        System.out.println(ans);
    }
    static int geek(int a,int b,int c,int n)
    {
        if(n<4)
        {
            if(n==3)
            {
                return c;
            }
            else if(n==2)
            {
                return b;
            }
            else {
                return a;
            }
        }
        return geek(a,b,c,n-3) + geek(a,b,c,n-2)+geek(a,b,c,n-1);
    }
}

public class power_four {
    public static void main(String[] args) {
        int n=5;
        boolean b=check_four(n);
        System.out.println(b);
    }
    static boolean check_four(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n%4!=0)
        {
            return false;
        }
        return check_four(n/4);
    }
}

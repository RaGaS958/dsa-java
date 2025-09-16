public class power_three {
    public static void main(String[] args) {
        int n=6;
        boolean b=check_three(n);
        System.out.println(b);
    }
    static boolean check_three(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n%3!=0)
        {
            return false;
        }
        return check_three(n/3);
    }
}

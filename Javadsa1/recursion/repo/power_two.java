public class power_two {
    public static void main(String[] args) {
        int n=32;
        boolean b=check_two(n);
        System.out.println(b);
    }
    static boolean check_two(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n%2!=0)
        {
            return false;
        }
        return check_two(n/2);
    }
}

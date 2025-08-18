public class sumn {
    public static void main(String[] args) {
        System.out.println("Sum till n:-"+sum(6));
    }
    static int sum(int n)
    {
        if(n<2)
        {
            return n;
        }
    return n+sum(n-1);

    }
}

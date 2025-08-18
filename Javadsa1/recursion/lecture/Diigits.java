
public class Diigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits:-"+sumDigits(12345));
    }
    static int sumDigits(int n)
    {
        if(n%10==n)
            return n;
        return (n%10) + sumDigits(n/10);
    }
}

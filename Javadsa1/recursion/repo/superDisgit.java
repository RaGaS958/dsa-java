public class superDisgit {
    public static void main(String[] args) {
        int num=9875;
        System.out.println(superDigit(num));
    }
    static int superDigit(int num)
    {
        if(num <9)
        {
            return num;
        }
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum+=r;
            num=num/10;
        }
        return superDigit(sum);
    }
}

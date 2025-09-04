public class Dice {
    public static void main(String[] args) {
        String s="4";
        dice("",s);
    }
    static void dice(String p,String up)
    {
        if(up.charAt(0)=='0')
        {
            System.out.println(p);
            return;
        }
        int num=up.charAt(0)-'0';
        for(int i=1;i<=num && i<6;i++)
        {
            if(num>=i)
            {
                String lat=""+(num-i);
                dice(p+i,lat);
            }
        }
    }
}

public class consirem {
    public static void main(String[] args) {
        String s="aaaaabcccccccc";
        String sr=rem(s,s.substring(0,1));
        System.out.println(sr);
    }
    static String rem(String up,String p)
    {
        if(up.isEmpty())
        {
            return p;
        }
        if(up.charAt(0)!=p.charAt(p.length()-1))
        {
           return  rem(up.substring(1),p+up.charAt(0));
        }
        else
        {
            return  rem(up.substring(1),p);

        }
    }
}

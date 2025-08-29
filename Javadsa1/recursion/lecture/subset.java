public class subset {
    public static void main(String[] args) {
        String s="abc";
        sub("",s);
    }
    static void sub(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        sub(p+up.charAt(0),up.substring(1));
        sub(p,up.substring(1));
    }
}

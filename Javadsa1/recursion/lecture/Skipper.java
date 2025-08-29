public class Skipper {
    public static void main(String[] args) {
        String s="abapplec";
       String fi= sub("",s,"apple");
        System.out.println(fi);

    }
    static String sub(String p,String up,String cond)
    {
        if(up.isEmpty())
        {

            return p;
        }
       if(up.startsWith(cond))
       {
           return sub(p,up.substring(cond.length()),cond);
       }
       else
       {
           return sub(p+up.charAt(0),up.substring(1),cond);
       }
    }
}

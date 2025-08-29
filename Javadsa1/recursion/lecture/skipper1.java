public class skipper1 {
    public static void main(String[] args) {
        String s="abapplc";
        String fi= sub("",s,"apple","app");
        System.out.println(fi);

    }
    static String sub(String p,String up,String cond ,String cond1)
    {
        if(up.isEmpty())
        {

            return p;
        }
        if( up.startsWith(cond1) && !up.startsWith(cond))
        {

                return sub(p, up.substring(cond1.length()), cond, cond1);



        }
        else
        {
            return sub(p+up.charAt(0),up.substring(1),cond,cond1);
        }
    }
}

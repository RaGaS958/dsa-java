public class arrangement_1 {
    public static void main(String[] args) {
        String s="abc";
        arrange("",s);
    }
    static void arrange(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        for(int i=0;i<p.length()+1;i++)
        {
            arrange(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1));
        }
    }
}

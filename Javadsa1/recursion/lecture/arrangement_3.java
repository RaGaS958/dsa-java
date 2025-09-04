public class arrangement_3 {
    public static void main(String[] args) {
        String s="abc";
        int count=arrange("",s);
        System.out.println(count);
    }
    static int arrange(String p,String up)
    {
        int count=0;
        if(up.isEmpty())
        {
            return 1;
        }
        for(int i=0;i<p.length()+1;i++)
        {
           count+= arrange(p.substring(0,i)+up.charAt(0)+p.substring(i,p.length()),up.substring(1));
        }
        return count;
    }
}

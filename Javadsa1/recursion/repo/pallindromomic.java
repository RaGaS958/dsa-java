import java.util.ArrayList;

public class pallindromomic {

    public static void main(String[] args) {
        String s="aaaba";
     pallin(s,new ArrayList<>());

    }
    static  void  pallin(String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            System.out.println(list);
            return;
        }

        String para="";
        for(int i=0;i<up.length();i++)
        {
            para=para+up.substring(i,i+1);
            if(check(para))
            {
                list.add(para);
                pallin(up.substring(1),list);
                list.remove(list.size()-1);
            }
        }

    }
    static boolean check(String p)
    {
        int s=0;
        int e=p.length()-1;
        while(s<e)
        {
            if(p.charAt(s)!=p.charAt(e))
            {
                return false;
            }
        }
        return true;
    }
}

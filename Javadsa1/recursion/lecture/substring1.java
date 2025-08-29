import java.util.ArrayList;

public class substring1 {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String>list=sub("",s);
        System.out.println(list);
    }
    static ArrayList<String> sub(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
       ArrayList<String> left= sub(p+up.charAt(0),up.substring(1));
        ArrayList<String> right =sub(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}


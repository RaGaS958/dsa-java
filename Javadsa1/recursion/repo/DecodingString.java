public class DecodingString {
    public static void main(String[] args) {
        String seq="3[a]2[bc]";
        String out=decode(seq,"");
        System.out.println(out);
    }
    static String decode(String up,String p)
    {
        if(up.isEmpty())
        {
            return p;
        }
        char start=up.charAt(0);
        if(start>='a'&& start<='z')
        {
           return  decode(up.substring(2),p+up.substring(0,1));
        }
        else {
            int count=start-'0';
            int st=2;
            int end=fetch_count(up.substring(1));
            String s=up.substring(st,end);
            String ss="";
            for (int i = 0; i < count; i++) {
                ss=ss+s;

            }
            return decode(up.substring(end+1),p+ss);
        }
    }
    static int fetch_count(String up)
    {
        for(int i=0;i<up.length();i++)
        {
            if(up.charAt(i)==']')
            {
                return i+2;
            }
        }
        return 2;
    }

}

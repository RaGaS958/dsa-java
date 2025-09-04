public class numpad {
    public static void main(String[] args) {
        String pad="12";
        numPad("",pad);
    }
    static void numPad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int start=up.charAt(0)-'0';
        for(int i=(start-1)*3;i<(start)*3;i++)
        {
            numPad(p+((char)('a'+i)),up.substring(1));
        }
    }
}

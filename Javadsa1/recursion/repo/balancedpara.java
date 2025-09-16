public class balancedpara {
    public static void main(String[] args) {
        String s="[]{}{}";
        boolean b=check(s,0,0,0);
        System.out.println(b);
    }
    static boolean check(String s,int sq,int cur,int pa)
    {
        if(s.isEmpty())
        {
            if(sq!=0 || pa!=0 || cur!=0)
            {
                return false;
            }
            else {
                return true;
            }
        }
        char ch=s.charAt(0);
        if(ch=='[')
        {
            sq+=1;

        }
        if(ch==']')
        {
            sq-=1;

        }
        if(ch=='{')
        {
            cur+=1;

        }
        if(ch=='}')
        {
            cur-=1;

        }
        if(ch=='(')
        {
            pa+=1;

        }
        if(ch==')')
        {
            pa-=1;

        }
        return check(s.substring(1),sq,cur,pa);
    }
}

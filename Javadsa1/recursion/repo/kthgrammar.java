public class kthgrammar {
    public static void main(String[] args) {
        int n=2;
        int k=2;
        char kth=grammar(n,k);
        System.out.println(kth);
    }
    static char grammar(int n,int k)
    {
        String row=create(n-1,"0");
        return row.charAt(k-1);
    }
    static String create(int n,String row)
    {
        if(n==0)
        {
            return row;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<row.length();i++)
        {
            if(row.charAt(i)=='0')
            {
                s.append("01");
            }
            else
            {
                s.append("10");
            }
        }
        return create(n-1,s.toString());
    }
}

public class pattern {
    public static void main(String[] args) {
        int r=10;
        int c=10;
        patterning(r,c);
        patterningg(r,c);
    }
    static void patterning(int r,int c)
    {
        if(r<1)
        {
            return ;
        }
        if(c>0) {
            System.out.print("* ");
            patterning(r,c-1);

        }
        else
        {
            System.out.println();
            patterning(r-1,r-1);

        }
    }
    static void patterningg(int r,int c)
    {
        if(r<1)
        {
            return ;
        }
        if(c>0) {
            System.out.print("* ");
            patterningg(r,c-1);

        }
        else
        {
            System.out.println();
            patterningg(r-1,10);

        }
    }
}

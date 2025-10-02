public class goodcount {
    public static void main(String[] args) {
        int n=1;
        int count=countGood(n,0,0);
        System.out.println(count);
    }
    static int countGood(int n,int start,int count)
    {
        if(((int)Math.log10(start)+1) > n)
        {
            return count;
        }
        if(check(start))
        {
            return countGood(n,start+1,count+1);
        }
        else
        {
           return  countGood(n,start+1,count);
        }
    }
    static boolean check(int num)
    {
        int c=0;
        while(num>0)
        {
            int start=num%10;

            if(c%2==0)
            {
                if(start%2!=0)
                {
                    return false;
                }
            }
            else
            {
                if(start!=2 || start!=3 || start!=5 || start!=7)
                {
                    return false;
                }
            }
            num=num/10;
        }
        return true;
    }

}

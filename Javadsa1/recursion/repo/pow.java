public class pow {
    public static void main(String[] args) {
        double num=2;
        int s=-2;
        System.out.println(pow(num,1,s));
    }
    static double pow(double num,double val,int s)
    {
        if(s==0)
        {
            return val;
        }
        if(s>0)
        {
            return pow(num,val*num,s-1);
        }
        else
        {
            return pow(num,(val)*(1/num),s+1);
        }
    }
}

public class perfectSquare {
    public static void main(String[] args) {
        int num=4;
        int count=countPer(num,0);
        System.out.println(count);
    }
    static int countPer(int num,int count)
    {
        if(num==0)
        {
            return count;
        }
        if(num<0)
        {
            return 0;
        }
        int val=0;
        int min=999;
        for(int i=4;i>0;i--)
        {
          val= countPer(num-(i*i),count+1);
          if(val!=0 && val<min)
          {
              min=val;
          }
        }
        return min;
    }
}

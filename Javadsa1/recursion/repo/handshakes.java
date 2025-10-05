public class handshakes {
    public static void main(String[] args) {
        int n=6;
        boolean arr[]=new boolean[n];
        System.out.println(countHandshakes(arr,0,1));
    }
    static int countHandshakes(boolean arr[],int st,int end)
    {
        if(end>arr.length)
        {
            if(fill(arr))
            {
                return 1;
            }
            else
            {
                return 0;
            }

        }
        int count1=0;
        int count2=0;

            arr[st]=true;
            arr[end]=true;
           count1= countHandshakes(arr,st+2,end+2);
            arr[st]=false;
            arr[end]=false;
            if((end+1)<arr.length)
            {
                arr[end+1]=true;
                arr[st]=true;
               count2= countHandshakes(arr,st+1,end+2);
                arr[end+1]=true;
                arr[st]=true;
            }
            return count1+count2;
    }
 static boolean fill(boolean arr[])
 {
     for(int i=0;i<arr.length;i++)
     {
         if(!arr[i])
         {
             return false;
         }
     }
     return true;
 }
}

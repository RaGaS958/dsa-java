import java.util.ArrayList;

public class winner_circular_game {
    public static void main(String[] args) {
        int n=6;
        int k=5;

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< n;i++)
        {
            list.add(i+1);
        }
        int winner=winner(list,k,0);
        System.out.println(winner);
    }
    static int  winner(ArrayList<Integer> list,int k,int start)
    {
        if(list.size()==1)
        {
            return list.getFirst();
        }
        int end=(start+(k-1))% list.size();
        list.remove(end);
        return winner(list,k,end);
    }

}

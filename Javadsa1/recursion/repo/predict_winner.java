import java.util.*;

public class predict_winner {
    public static void main(String[] args) {
        ArrayList<Integer > list = new ArrayList<>(Arrays.asList(1,2,5));
        System.out.println(game(list,0,0,1));

    }
    static boolean game(ArrayList<Integer> list,int player1,int player2,int chance)
    {
        if(list.isEmpty())
        {
            if(player1>=player2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        int min=0;
        int max=list.size()-1;
        int list_min= list.get(min);
        int list_max=list.get(max);
        boolean a=true,b=true,c=true,d=true;
        if(chance %2!=0) {
            list.remove(min);
             a=game(list,player1+ list_min,player2,chance+1);
            list.add(min,list_min);
            list.remove(max);
             b=game(list,player1+ list_max,player2,chance+1);
        }
        else {
            list.remove(min);
             c=game(list,player1,player2+list_min,chance+1);
            list.add(min,list_min);
            list.remove(max);
             d=game(list,player1,player2+ list_max,chance+1);
        }
        boolean res=(a&b)&(c&d);
        return res;

    }
}

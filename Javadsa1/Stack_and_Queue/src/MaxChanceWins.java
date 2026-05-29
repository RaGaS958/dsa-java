import java.util.Stack;

public class MaxChanceWins {

private Stack<Integer> player1;
private Stack<Integer> player2;

public MaxChanceWins()
{
    this.player1=new Stack<>();
    this.player2=new Stack<>();
}

public void insertPlayer1(int i)
{
    player1.push(i);
}
public void insertPlayer2(int i)
{
    player2.push(i);
}
public int maxScore(int maxsum)
{
    return maxGame(player1,player2,maxsum,0);
}

private int maxGame(Stack<Integer>player1,Stack<Integer>player2,int maxsum,int maxchance)
{
    if(maxsum<0)
    {
        return maxchance-1;
    }
    int max1=maxchance,max2=maxchance;
    int pop1=0;int pop2=0;
    if(!player1.isEmpty())
    {
        pop1=player1.pop();
         max1=maxGame(player1,player2,maxsum-pop1,maxchance+1);
         player1.push(pop1);
    } if(!player2.isEmpty())
    {
        pop2=player2.pop();

        max2=maxGame(player1,player2,maxsum-pop2,maxchance+1);
        player2.push(pop2);
    }

    return Math.max(max1,max2);
}


public void player1view()
{
    System.out.println(player1);
}
public void player2view()
{
    System.out.println(player2);
}




}


import java.util.*;
public class LectureProblems {

    public static void main(String[] args)  throws StackCustomException {

  //-------------------------------------------------------------------------
        // Queue using stack



//        QueueUsingStack queue=new QueueUsingStack();
//
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//        queue.push(5);
//        queue.pop();
//        queue.peek();

  //-------------------------------------------------------------------------

  //Max player game

//    MaxChanceWins game=new MaxChanceWins();
//    game.insertPlayer1(1);
//    game.insertPlayer1(6);
//    game.insertPlayer1(4);
//    game.insertPlayer1(2);
//    game.insertPlayer1(4);
//    game.insertPlayer2(5);
//    game.insertPlayer2(8);
//    game.insertPlayer2(1);
//    game.insertPlayer2(2);
//
//    game.player1view();
//    game.player2view();
//
//
//        System.out.println(game.maxScore(10));

//-------------------------------------------------------------------------

//Largets area histogram


//-------------------------------------------------------------------------
//valid parenthesis

//  String s="{[(]}";
//  Stack<Character> paren=new Stack<>();
//  boolean valid=true;
//  int i=0;
//  while(!(s.isEmpty()) && i<s.length())
//  {
//      char first=s.charAt(i);
//      if(first =='}'  || first==']' || first==')')
//      {
//          if(!(first-paren.peek()<3))
//          {
//              valid=false;
//              break;
//          }
//          else
//          {
//              paren.pop();
//          }
//      }
//      else {
//          paren.push(first);
//      }
//      i++;
//  }
//        System.out.println(valid);

//-------------------------------------------------------------------------
//no of  ways to fix invalid parenthesis
//        String s="{[(}";
//        String par[]={"]","}",")"};
//        int count[]=new int[3];
//        Stack<Character> paren=new Stack<>();
//        int i=0;
//        while(!(s.isEmpty()) && i<s.length())
//        {
//            char first=s.charAt(i);
//            if(first =='}'  || first==']' || first==')')
//            {
//                if(!(first-paren.peek()<3))
//                {
//                    if(paren.peek()=='{')
//                    {
//                        count[1]+=1;
//                    }
//                    else if(paren.peek()=='[')
//                    {
//                        count[0]+=1;
//                    }
//                    else
//                    {
//                        count[2]+=1;
//                    }
//                }
//                else
//                {
//                   i++;
//                }
//                paren.pop();
//
//            }
//            else {
//                paren.push(first);
//                i++;
//
//            }
//
//        }
//        System.out.println("Total mistakes = "+(count[0]+count[1]+count[2]));
//        System.out.println(Arrays.toString(par));
//        System.out.println(Arrays.toString(count));



//-------------------------------------------------------------------------
    }
}

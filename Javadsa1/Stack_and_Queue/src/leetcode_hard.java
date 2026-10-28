import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class leetcode_hard {

    public static void main(String[] args) {

 //----------------------------------------------------------------------------------------
//  // question:-https://leetcode.com/problems/longest-valid-parentheses/description/
//  String s="";
//  int length=0;
//   Stack<Character> valid=new Stack<>();
//   for(int i=0;i<s.length();i++)
//   {
//       valid.add(s.charAt(i));
//
//   }
//   while(!valid.isEmpty())
//   {
//       char top=valid.pop();
//       if(!valid.isEmpty())
//       {
//           if(valid.peek()=='(')
//           {
//               length+=2;
//               valid.pop();
//
//           }
//
//       }
//   }
//        System.out.println("Max parenthesis length :- "+length);
//----------------------------------------------------------------------------------------
//// question :-https://leetcode.com/problems/sliding-window-maximum/description/
//
// int arr[] ={1,3,-1,-3,5,3,6,7};
// int k=3;
//Stack<Integer> sliding_window=new Stack<>();
//Stack<Integer> history =new Stack<>();
//
// ArrayList<Integer> max_window_element=new ArrayList<>();
// for(int i= arr.length-1;i>-1;i--)
// {
//     sliding_window.add(arr[i]);
// }
//
// while(!sliding_window.isEmpty())
// {
//     int max=0;
//     if(k < sliding_window.size())
//     {
//         for(int i=0;i<k;i++)
//         {
//             if(sliding_window.peek()>max)
//             {
//                 max=sliding_window.peek();
//
//             }
//             history.add(sliding_window.pop());
//         }
//         max_window_element.add(max);
//         for(int i=0;i<k-1;i++)
//         {
//             sliding_window.add(history.pop());
//         }
//         history.pop();
//
//     }
//     else
//     {
//         int size= sliding_window.size();
//         for(int i=0;i< size;i++)
//         {
//             if(sliding_window.peek()>max)
//             {
//                 max=sliding_window.peek();
//             }
//             sliding_window.pop();
//
//         }
//         max_window_element.add(max);
//     }
// }
//        System.out.println("max sliding window result :- "+max_window_element);



//----------------------------------------------------------------------------------------


    }
}

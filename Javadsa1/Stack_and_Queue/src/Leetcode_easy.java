import java.util.*;

public class Leetcode_easy {

    public static void main(String[] args) {
//--------------------------------------------------------------------

//question:-https://leetcode.com/problems/next-greater-element-i/description/

//        Stack<Integer> num1=new Stack<>();
//        int arr[]={1,3,4,2};
//        Stack<Integer> fillup=new Stack<>();
//        ArrayList<Integer>res=new ArrayList<>();
//        num1.push(2);
//        num1.push(1);
//        num1.push(4);
//
//        while(!num1.isEmpty())
//        {
//            int comp=num1.pop();
//            for(int i=arr.length-1;i>-1 && arr[i]!=comp;i--)
//            {
//                fillup.push(arr[i]);
//            }
//            int top=-1;
//            if(!fillup.isEmpty()) {
//                if(fillup.peek()>comp) {
//                    top = fillup.peek();
//                }
//            }
//            fillup.clear();
//            res.add(top);
//        }
//        System.out.println(res);

//
//--------------------------------------------------------------------
////quenstion:-https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
//
//  String s="azxxzy";
//  Stack<String> pro=new Stack<>();
//  Stack<String> pre=new Stack<>();
//  for(int i=0;i<s.length();i++)
//  {
//      pro.push(s.substring(i,i+1));
//  }
//        System.out.println(pro.peek());
//  while(!pro.isEmpty())
//  {
//
//      if(pre.isEmpty() )
//      {
//          pre.push(pro.pop());
//
//      }
//      else if( !pro.peek().equalsIgnoreCase(pre.peek()) )
//      {
//          pre.push(pro.pop());
//
//      }
//      else
//      {
//          pre.pop();
//          pro.pop();
//      }
//
//  }
//
//  StringBuilder ss=new StringBuilder();
//
//  while(!pre.isEmpty())
//  {
//      ss.append(pre.pop());
//  }
//        System.out.println(ss.toString());
//--------------------------------------------------------------------
//question:-https://leetcode.com/problems/remove-outermost-parentheses/description/

// String paren="(()())(())(()())";
// Stack <Character>processed=new Stack<>();
// Stack<Character> pre=new Stack<>();
// StringBuilder ss=new StringBuilder();
// for(int i=paren.length()-1;i>-1;i--)
// {
//     pre.push(paren.charAt(i));
// }
// boolean check=false;
// while(!pre.isEmpty())
// {
//     char top=pre.pop();
//     if(top=='(')
//     {
//             check=false;
//         processed.push(top);
//     }
//     else
//     {
//         if(check)
//         {
//             processed.clear();
//         }
//         else
//         {
//             ss.append(processed.pop());
//             ss.append(top);
//             check=true;
//         }
//     }
//
//
//
//
// }
//
//        System.out.println(ss.toString());

//--------------------------------------------------------------------

////question:-https://leetcode.com/problems/remove-outermost-parentheses/description/
//
//  String paren="(()())(())(()(()))";
// Stack <Character>processed=new Stack<>();
// int cs=0;
// int ce=0;
// Stack<Character> pre=new Stack<>();
// StringBuilder ss=new StringBuilder();
// boolean cond=true;
// for(int i=paren.length()-1;i>0;i--)
// {
//     pre.push(paren.charAt(i));
// }
// while(!pre.isEmpty())
// {
//     char top=pre.pop();
//     if(top=='(')
//     {
//             cs+=1;
//
//     }
//     else
//     {       if(cs>0) {
//             ce += 1;
//              }
//              else if(!pre.isEmpty())
//     {
//         pre.pop();
//     }
//
//     }
//
//     if(cs>0 && ce>0  && cs==ce)
//     {
//         while(cs!=0)
//         {
//             ss.append('(');
//             cs-=1;
//         }
//         while(ce!=0)
//         {
//             ss.append(")");
//             ce-=1;
//         }
//
//     }
// }
//
//        System.out.println(ss.toString());

//------------------------------------------------------------------------------

 // Question :-https://leetcode.com/problems/number-of-recent-calls/description/
//

//Scanner sc =new Scanner(System.in);
// int upperLimit=0;
// int lowerLimit=0;
//
// Stack<Integer> bucket1=new Stack<>();
// Stack<Integer> bucket2=new Stack<>();
// ArrayList<Integer> list=new ArrayList<>();
// boolean cond=true;
//
// while(cond)
// {
//     System.out.println("Enter the Ping");
//     int ping=sc.nextInt();
//     upperLimit=ping;
//     lowerLimit=ping-3000;
//     int count=0;
//     if(list.isEmpty())
//     {
//         list.add(1);
//         bucket1.push(ping);
//     }
//     else
//     {
//         bucket1.push(ping);
//         while( !bucket1.empty() &&  bucket1.peek()>=lowerLimit && bucket1.peek()<=upperLimit)
//         {
//             count+=1;
//             bucket2.push(bucket1.pop());
//         }
//         bucket1.clear();
//         while(!bucket2.isEmpty())
//         {
//             bucket1.push(bucket2.pop());
//         }
//         list.add(count);
//
//     }
//     System.out.println("Continue?");
//     cond=sc.nextBoolean();
// }
//        System.out.println(list);
//--------------------------------------------------------------------------------------------------------
// // question:-https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
//
//        Queue<Integer> q = new ArrayDeque<>();
//        Stack<Integer> s=new Stack<>();
//
//    Scanner sc=new Scanner(System.in);
//    int i=5;
//    while(i!=0)
//    {
//        System.out.println("Push num:-");
//        q.add(sc.nextInt());
//        i--;
//
//    }
//    int k=4;
//    int left=q.size()-k;
//    while(k!=0)
//    {
//        s.push(q.remove());
//        k--;
//
//    }
//    while(!s.isEmpty())
//    {
//        q.add(s.pop());
//    }
//
//    while(left!=0)
//    {
//        q.add(q.remove());
//        left--;
//    }
//        System.out.print("[ ");
//        while(!q.isEmpty())
//        {
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println("]");
//
//
//
//--------------------------------------------------------------------------------------------------------
//question:-https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

//  Scanner sc=new Scanner(System.in);
//  Stack<Integer> s=new Stack<>();
//System.out.println("Enter size:-");
//int size=sc.nextInt();
//
//  for(int i=0;i<size;i++)
//  {
//      s.push(sc.nextInt());
//
//  }
//
// int mid=0;
//
//  if(size%2==0)
//  {
//      mid=size/2;
//  }
//  else
//  {
//      mid=(size/2)+1;
//  }
//        System.out.println(mid);
//  for(int i=1;i<=size;i++)
//  {
//         if(i==mid)
//         {
//             s.pop();
//
//         }
//         else {
//             s.addFirst(s.pop());
//         }
//  }
//  while(!(s.isEmpty()))
//  {
//      System.out.println(s.pop());
//  }
//--------------------------------------------------------------------------------------------------------

//  question:-https://leetcode.com/problems/flood-fill/description/

//      Stack<Integer> rows=new Stack<>();
//      Stack<Integer> cols=new Stack<>();
//
//        int[][] arr = {
//                {1, 1, 1},
//                {1, 1, 0},
//                {1, 0, 1}
//        };
//
//        int sr=1;
//        int sc=1;
//        int color=2;
//        int val=arr[1][1];
//        int rsize=3;
//        int csize=3;
//
//        rows.push(sr);
//        cols.push(sc);
//
//
//        while(!(rows.isEmpty() && cols.isEmpty()))
//        {
//            int r=rows.pop();
//            int c=cols.pop();
//            arr[r][c]=color;
//            if((!(r+1>=rsize))  && arr[r+1][c]==val)
//            {
//               rows.push(r+1);
//               cols.push(c);
//
//
//            } if((!(c+1>=csize))  && arr[r][c+1]==val)
//            {
//               rows.push(r);
//               cols.push(c+1);
//
//
//            } if((!(r-1<0))  && arr[r-1][c]==val)
//            {
//               rows.push(r-1);
//               cols.push(c);
//
//
//            } if((!(c-1<0))  && arr[r][c-1]==val)
//            {
//               rows.push(r);
//               cols.push(c-1);
//
//
//            }
//
//        }
//        for(int i=0;i<rsize;i++)
//        {
//            for(int j=0;j<csize;j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//

//--------------------------------------------------------------------------------------------------------





//--------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------

    }
}
import java.util.*;

public class leetcode_medium {


    public static void main(String[] args) {

 //----------------------------------------------------------------------------------------
 // question:-https://leetcode.com/problems/decode-string/description/

//String s="2[a]4[ac2[b]e]er";
//Stack <String> decoder=new Stack<>();
//for(int i=0;i<s.length();i++)
//{
//    decoder.push(s.substring(i,i+1));
//}
//
//int count=0;
//String num="";
//String alpha="";
//StringBuilder ss=new StringBuilder();
//
//while(!decoder.isEmpty())
//{
//    if(decoder.peek().charAt(0) == ']')
//    {
//        count =1;
//        decoder.pop();
//
//        while(!decoder.isEmpty()  && count!=0)
//        {
//            if(decoder.peek().charAt(0) == ']')
//            {
//                count++;
//            }
//            if(decoder.peek().charAt(0) == '[')
//            {
//                count--;
//            }
//            alpha= decoder.pop()+alpha;
//        }
//        alpha=alpha.substring(1,alpha.length());
//        System.out.println(alpha);
//        while(!decoder.isEmpty())
//        {
//            if(decoder.peek().charAt(0)>=48 && decoder.peek().charAt(0)<=57)
//            {
//                num = decoder.pop() + num;
//                System.out.println(num);
//            }
//            else
//            {
//                break;
//            }
//        }
//        int times=0;
//
//        if(num!="")
//         times=Integer.parseInt(num);
//      String sumation="";
//        for(int i=0;i<times;i++)
//        {
//
//          sumation=alpha+sumation;
//        }
//        alpha=sumation;
//        for(int i=0;i<alpha.length();i++)
//        {
//            decoder.push(alpha.substring(i,i+1));
//        }
//     num="";
//        alpha="";
//
//    }
//    else
//    {
//     ss.append(decoder.pop());
//    }
//}
//
//        System.out.println(ss.reverse().toString());
//
//
//
////to be done

 //----------------------------------------------------------------------------------------
 //question:-https://leetcode.com/problems/asteroid-collision/description/

//        Stack<Integer> ast=new Stack<>();
//
//        int inp[]={3,5,-6,2,-1,4};
//        for(int i=0;i<inp.length;i++)
//        {
//            if(ast.isEmpty())
//            {
//                ast.push(inp[i]);
//            }
//            else
//            {
//                if(ast.peek()>0 && inp[i]<0)
//                {
//                    int a=Math.abs(ast.peek());
//                    int b=Math.abs(inp[i]);
//                    while( (!ast.isEmpty()) && a<=b)
//                    {
//                        if(a==b)
//                        {
//                            inp[i]=0;
//                        }
//
//                        ast.pop();
//                        if((!ast.isEmpty()) && ast.peek()>0) {
//                            a = Math.abs(ast.peek());
//                        }
//                        else
//                        {
//                            break;
//                        }
//                    }
//                    if(ast.isEmpty())
//                    {
//                        if(inp[i]!=0)
//                        ast.push(inp[i]);
//                    }
//                    else if(ast.peek()<0)
//                    {
//                        ast.push(inp[i]);
//                    }
//                  else
//                    {
//                        //do nothing
//                    }
//
//                }
//                else
//            {
//                ast.push(inp[i]);
//            }
//            }
//
//
//        }
//
//        ArrayList<Integer> arr=new ArrayList<>();
//        while(!ast.isEmpty())
//        {
//            arr.add(ast.pop());
//        }
//        System.out.println(arr);


 //----------------------------------------------------------------------------------------

     //question:-https://leetcode.com/problems/132-pattern/description/

//     int [] num={3,1,4,2};
//
//     Stack<Integer> checker=new Stack<>();
//
//     boolean cond=false;
//
//     int min=99999;
//     int posi=0;
//     for(int i=0;i< num.length;i++)
//     {
//        if(num[i]<min)
//        {
//            min=num[i];
//            posi=i;
//        }
//     }
//
//     int max=-1;
//     int posj=0;
//        for(int i=posi+1;i< num.length;i++)
//        {
//            if(num[i]>max)
//            {
//                max=num[i];
//                posj=i;
//            }
//        }
//        int posk=0;
//        for(int i=posj+1;i<num.length;i++)
//        {
//            if(num[i]<num[posj] && num[i]>num[posi])
//            {
//                cond=true;
//                posk=i;
//                System.out.println("["+num[posi]+","+num[posj]+","+num[posk]+"]");
//            }
//        }
//        if(cond)
//        {
//            System.out.println("founded");
//        }
//        else
//        {
//            System.out.println("not founded");
//        }



 //----------------------------------------------------------------------------------------
        //question:-https://leetcode.com/problems/132-pattern/description/


//        Stack<Integer> cand3=new Stack<>();
//        int cand2=-9999999;
//        int [] num={3,1,4,2};
//         boolean cond=false;
//        for(int i= num.length-1;i>-1;i--)
//        {
//            if(cand3.isEmpty())
//            {
//                cand3.push(num[i]);
//            }
//            else if(num[i]>cand3.peek())
//            {
//                cand2=cand3.pop();
//                cand3.push(num[i]);
//            }
//            else if(num[i]<cand3.peek() && num[i]<cand2)
//            {
//                cond=true;
//                break;
//            }
//            else
//            {
//                cand2=num[i];
//            }
//
//
//        }
//        if(cond)
//        {
//            System.out.println("found it");
//        }
//        else
//        {
//            System.out.println("Not found it");
//        }
        
 //----------------------------------------------------------------------------------------

//      //  question:-https://leetcode.com/problems/find-the-most-competitive-subsequence/description/
//
//        int [] arr={2,4,3,3,5,4,9,6};
//
//         Stack <Integer> num =new Stack<>();
//
//         int k=4;
//
//         int min=arr[0];
//         int pos=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<min)
//             {
//                 min=arr[i];
//                 pos=i;
//             }
//         }
//         num.push(arr[pos]);
//         for( int i=pos+1;i<arr.length;i++)
//         {
//             if(num.size()<k )
//             {
//                 if(arr[i]<num.peek())
//                 {
//                     while(!num.isEmpty() && arr[i]< num.peek())
//                     {
//                         num.pop();
//                     }
//                     num.push(arr[i]);
//                 }
//                 else
//                 {
//                     num.push(arr[i]);
//                 }
//             }
//             else
//             {
//                 if(arr[i]<num.peek())
//                 {
//                     while(!num.isEmpty() && arr[i]< num.peek())
//                     {
//                         num.pop();
//
//                     }
//                     num.push(arr[i]);
//                 }
//             }
//
//         }
//         ArrayList<Integer> a=new ArrayList<>();
//         while(!num.isEmpty())
//         {
//             a.add(num.pop());
//         }
//        System.out.println(a.reversed());

 //----------------------------------------------------------------------------------------
// // Question :- https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1
//
//Stack <Integer> position=new Stack<>();
//int [] gas = {3,9} ;
//int [] cost = {7,6} ;
//
//for(int i=0;i<gas.length;i++)
//{
//    if(gas[i]>cost[i])
//    {
//        position.push(i);
//    }
//
//}
//
//ArrayList<Integer> valid=new ArrayList<>();
//
//while(!position.isEmpty())
//{
//    int residue=0;
//    int start=position.pop();
//    for(int i = 0;i< gas.length;i=i+1)
//    {
//        residue=residue+(gas[start]-cost[start]);
//        start=(start+1)% gas.length;
//        if(residue <0)
//        {
//            break;
//        }
//    }
//    if(residue>=0)
//    {
//        valid.add(start);
//    }
//
//}
//        if(valid.isEmpty())
//            System.out.println(-1);
//        else
//        System.out.println(valid);
//
 //----------------------------------------------------------------------------------------
////question:-https://leetcode.com/problems/task-scheduler/description/
//
//        String arr[]={"A","C","A","B","D","B"};
//        int n=1; // gap
//        ArrayList<String>task=new ArrayList<>();
//        ArrayList<Integer>task_num=new ArrayList<>();
//        Arrays.sort(arr);
//        int count =1;
//        // for creating counters for each
//        for(int i=0;i<=arr.length;i++)
//        {
//            // for end of loop
//            if(i==arr.length)
//            {
//                task_num.add(count);
//                break;
//
//            }
//            else {
//                 // for start of loop
//                if(task.isEmpty())
//                {
//                    task.add(arr[0]);
//                }
//                else {
//
//                    if (arr[i] == task.getLast()) {
//                        count++;
//                    }
//                    else {
//                        task_num.add(count);
//                        task.add(arr[i]);
//                        count = 1;
//                    }
//                }
//            }
//        }
//        int slots[]=new int [task.size()];
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("TASK SCHEDULER METRICS");
//        System.out.println("Initial cool down :- "+Arrays.toString(slots));
//        System.out.println("Cpu Tasks :- "+task);
//        System.out.println("Cpu Tasks Number :- "+task_num);
//        System.out.println("--------------------------------------------------------------");
//
//        Queue<Integer> taskScheduler=new LinkedList<>();
//
//        for(int i=0;i<task.size();i++)
//        {
//            taskScheduler.offer(i);
//        }
//        int min_CpuInterval=0;
//
//        while(!taskScheduler.isEmpty())
//        {
//            int start=taskScheduler.peek();
//            if(task_num.get(start)!=0)
//            {
//                if(slots[start]==0)
//                {
//                    slots[start]=n+1;
//                    taskScheduler.offer(taskScheduler.remove());
//                    min_CpuInterval+=1;
//                    task_num.set(start,task_num.get(start)-1);
//                    System.out.print(task.get(start)+" -> ");
//                }
//                else
//                {
//                    min_CpuInterval+=1;
//                    System.out.print(" idle -> ");
//                }
//
//            }
//            else
//            {
//                taskScheduler.remove();
//            }
//            for(int i=0;i<slots.length;i++)
//            {
//                if(slots[i]>0)
//                {
//                    slots[i]-=1;
//                }
//            }
//        }
//        System.out.println("End");
//        System.out.println("Min CPU INTERVAL = "+min_CpuInterval);

 //----------------------------------------------------------------------------------------
//  //question:-https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
//
//  int [] arr={10, 4, 5, 90, 120, 80};
//  Stack<Integer> stock1=new Stack<>();
//  Stack<Integer> stock2=new Stack<>();
//  ArrayList<Integer> stockSpans=new ArrayList<>();
//
//  for(int i=0;i<arr.length;i++)
//  {
//      stock1.push(arr[i]);
//
//  }
//  int span=1;
//  while(!stock1.isEmpty())
//  {
//
//      int start=stock1.pop();
//      while(!stock1.isEmpty() && stock1.peek()<start)
//      {
//          span+=1;
//          stock2.push(stock1.pop());
//      }
//      stockSpans.add(span);
//      while(!stock2.isEmpty())
//      {
//          stock1.push(stock2.pop());
//      }
//      span=1;
//  }
//        System.out.println(stockSpans.reversed());
//

 //----------------------------------------------------------------------------------------
// question:https://www.geeksforgeeks.org/problems/max-rectangle/1


// int[][] mat = {
//                {0, 1, 1},
//                {1, 1, 1},
//                {0, 1, 1}
//        };
//
//
// int [][] mat_h=mat;
// int [][] mat_v=new int[mat.length][mat[0].length];
// for(int i=0;i<mat.length;i++)
// {
//     for(int j=0;j<mat[0].length;j++)
//     {
//         mat_v[i][j]=mat[j][i];
//     }
// }
//
//    Stack<Integer> horizontal=new Stack<>();
//   for(int i=mat_h.length;i>-1;i--)
//   {
//       horizontal.push(i);
//   }
//
// Stack<Integer> Vertical =new Stack<>();
//        for(int i=mat_h.length;i>-1;i--)
//        {
//            Vertical.push(i);
//        }
//
// int max_sum=0;
//
// // Horizontal analysis
//
//        while(!horizontal.isEmpty())
//        {
//
//        }

//-----------------------------------------------------------------------------------

//question:-https://leetcode.com/problems/snakes-and-ladders/description/

//int board[][]={
//        {-1, -1, -1, -1, -1, -1},
//        {-1, -1, -1, -1, -1, -1},
//        {-1, -1, -1, -1, -1, -1},
//        {-1, 35, -1, -1, 13, -1},
//        {-1, -1, -1, -1, -1, -1},
//        {-1, 15, -1, -1, -1, -1}
//};
//
//Stack<Integer> val=new Stack<>();
//Stack<Integer> pos=new Stack<>();
//int boardVal=board.length * board.length;
//for(int i=0;i<board.length;i++)
//{
//    if(i%2==0)
//    {
//        for(int j=0;j<board[0].length;j++)
//        {
//            val.push(board[i][j]);
//            pos.push(boardVal);
//            boardVal-=1;
//
//        }
//    }
//    else
//    {
//        for(int j=board[0].length-1;j>-1;j--)
//        {
//            val.push(board[i][j]);
//            pos.push(boardVal);
//            boardVal-=1;
//
//        }
//    }
//}
//
//int curr=1;
//
//int output=snakeLadder(val,pos,curr,0,board.length*board.length);
//System.out.println(output);


 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
    }
//-----------------------------------------------------------------------------------------
//function of  question:-https://leetcode.com/problems/snakes-and-ladders/description/

//static int snakeLadder(Stack<Integer> val ,Stack<Integer> pos,int curr,int output,int n)
//{
//    return gameStart(val,pos,curr,output,n);
//}
//
//private static int gameStart(Stack<Integer> val ,Stack<Integer> pos,int curr,int output,int n)
//{
//    if (val.isEmpty())
//{
//        return output;
//    }
//
//    int start=curr+1;
//    int end=Math.min(curr+6,n*n);
//    int currOutput=99999999;
//    for(int i=start;i<=end;i++)
//    {
//        int next=i;
//        if(pos.peek()>next)
//        {
//            continue;
//        }
//        else
//        {
//            while(pos.peek()!=next)
//            {
//                pos.pop();
//                val.pop();
//            }
//        }
//        if(val.peek()!=-1)
//        {
//            next=val.peek();
//        }
//        output+=1;
//        output=gameStart(val,pos,next,output,n);
//
//        if(output<currOutput)
//        {
//            currOutput=output;
//        }
//        output-=1;
//
//    }
//    return currOutput;
//}




//----------------------------------------------------------------------------------------








}

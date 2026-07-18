import java.util.ArrayList;
import java.util.Stack;

public class leetcode_medium {


    public static void main(String[] args) {

 //----------------------------------------------------------------------------------------
 // question:-https://leetcode.com/problems/decode-string/description/

//String s="2[a]4[ac]er";
//
//StringBuilder ss=new StringBuilder();
//Stack<String> series=new Stack<>();
//int num=0;
//String numextract="";
//String current="";
//for(int i=0;i<s.length();i++)
//{
//    char ch=s.charAt(i);
//     if(ch > 47 && ch< 58) {
//         while (s.charAt(i) > 47 && s.charAt(i) < 58) {
//             numextract = numextract + s.substring(i, i + 1);
//             i++;
//         }
//         num=Integer.parseInt(numextract);
//     }
//     else if(ch =='[')
//     {
//         int bkt=1;
//         i++;
//         while(bkt!=0) {
//
//             if(s.charAt(i)=='[')
//             {
//                 bkt+=1;
//             }
//             else if (s.charAt(i) == ']')
//             {
//                 bkt-=1;
//             }
//             else {
//                 series.push(s.substring(i, i + 1));
//             }
//         }
//     }
//
//
//}

//to be done


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





        
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------



    }
}

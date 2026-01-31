import java.util.ArrayList;

public class para_solve {
    public static void main(String[] args) {
        String exp="2*3-4*5";
        ArrayList<String> list =solution(exp,"",3,3);
        System.out.println(list);
    }
    static ArrayList<String> solution(String exp,String pro,int s,int e)
    {
        if(exp.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();


                System.out.println(pro);
                list.add(pro);
                return list;


        }
        char ch=exp.charAt(0);
        ArrayList<String> outer=new ArrayList<>();
        if(ch=='-' | ch=='+' | ch=='*' | ch=='/'| ch=='%')
        {
            outer.addAll(solution(exp.substring(1),pro+exp.substring(0,1),s,e));

        }
        else if(ch>='1' && ch<='9')
        {


                outer.addAll(solution(exp.substring(1),pro+"("+exp.substring(0,1),s-1,e));
//                outer.addAll(solution(exp.substring(1),pro+exp.substring(0,1),s,e));
                outer.addAll(solution(exp.substring(1),pro+exp.substring(0,1)+")",s,e-1));
                outer.addAll(solution(exp.substring(1),pro+exp.substring(0,1),s,e));


        }
        return outer;


    }
}

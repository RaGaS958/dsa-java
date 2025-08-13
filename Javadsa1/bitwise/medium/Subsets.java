import java .util.*;
public class Subsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers:-");
        ArrayList<Integer>list =new ArrayList<>();
        while(sc.hasNextInt())
        {
            list.add(sc.nextInt());
        }
        System.out.println("OutPut:-"+subSets(list));
    }
    static ArrayList<ArrayList<Integer>> subSets(ArrayList<Integer> list)
    {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        int totalSets=1<<list.size();
        for(int i=0;i<totalSets;i++)
        {
            ArrayList<Integer> subList=new ArrayList<>();
            for (int j=0;j<list.size();j++)
            {
                if((i & (1<<j))!=0)
                {
                    subList.add(list.get(j));
                }
            }
            mainList.add(subList);
        }
        return mainList;
    }
}

//import java.util.*;
//public class Consistent {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the allowed=");
//        String allowed=sc.next();
//        ArrayList<String> list=new ArrayList<>();
//        System.out.print("Enter the Strings in the Array:-");
//        while(sc.hasNext())
//        {
//            list.add(sc.next());
//        }
//        System.out.println("Allowed :-"+allowed);
//        System.out.println("Array is :-"+list);
//        System.out.println("Consistent is:-"+consistent(list,allowed));
//
//
//    }
//    static int consistent(ArrayList<String> list,String a)
//    {
//        int c=0;
//        for(int i=0;i<list.size();i++)
//        {
//            int j=0;
//            int val=0;
//            String ele=list.get(i);
//            while(j<ele.length)
//            {
//                val=val^(ele.charAt(j++));
//            }
//
//        }
//        return c;
//    }
//}

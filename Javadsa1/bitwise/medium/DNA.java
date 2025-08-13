import java.util.*;
public class DNA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the DNA sequence=");
        String s=sc.next();
        System.out.println("Repeated DNA Sequence is"+Dna(s));
    }
    static ArrayList<String> Dna(String s)
    {
        ArrayList<String> list=new ArrayList<>();
        String []sub=subStrings(s);
        Arrays.sort(sub);
        for(int i=0;i<sub.length-1;i++)
        {
            if(sub[i].equals(sub[i+1]))
            {
                list.add(sub[i]);
                while(i<sub.length-1 && sub[i].equals(sub[i+1]))
                {
                    i++;
                }

            }

        }
        return list;
    }
    static String[] subStrings(String s)
    {
        int sub=s.length()-9;
        String []arr=new String[sub];
        for(int i=0;i<sub;i++)
        {
            arr[i]=s.substring(i,i+10);
        }
        return arr;
    }
}

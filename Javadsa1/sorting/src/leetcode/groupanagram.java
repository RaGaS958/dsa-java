package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class groupanagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        ArrayList<ArrayList<String>> list=anagram(arr);
        System.out.println(list);
    }
    static ArrayList<ArrayList<String>> anagram(String arr[])
    {
        ArrayList<ArrayList<String>> list= new ArrayList<>();
        int k=0;
        while(k<arr.length)
        {
            if(arr[k]!=null) {
                ArrayList<String> sub = new ArrayList<>();
                String tar = sorter(arr[k]);
                sub.add(arr[k]);
                for (int i = k + 1; i < arr.length; i++) {
                    if (arr[i] != null && tar.equals(sorter(arr[i]))) {

                        sub.add(arr[i]);
                        arr[i] = null;
                    }
                }
                list.add(sub);
            }
            k++;
        }

     return list;
    }
    static String sorter(String s)
    {
        String sub[]=s.split("");
        Arrays.sort(sub);
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<sub.length;i++)
        {
            ss.append(sub[i]);
        }
        return ss.toString();
    }

}

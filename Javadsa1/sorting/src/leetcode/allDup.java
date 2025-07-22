package leetcode;

import java.util.*;

public class allDup {

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array=");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("enter elements in array:-");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    ArrayList<Integer> c=count(arr);
    System.out.println(c);
}
static ArrayList<Integer> count(int arr[])
{
    ArrayList<Integer> list=new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]==arr[i+1])
        {
            list.add(arr[i]);
            i++;
        }
    }

    return list;
}

}
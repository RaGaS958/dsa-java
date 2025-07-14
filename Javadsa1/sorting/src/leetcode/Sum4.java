package leetcode;
import java.util.*;
public class Sum4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target=");
        int target=sc.nextInt();
        ArrayList<ArrayList<Integer>>list=count(arr,target);
        System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>> count(int arr[],int tar)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
      Arrays.sort(arr);
        int s=0;
      int e=arr.length-1;
      int min=1111111;
      while(s+1<e-1)
      {
          int sum=arr[s]+arr[e];
          int e1=e-1;
          int s1=s+1;

          while(s1<e1)
          {
              int innersum=sum+arr[s1]+arr[e1];
              if(innersum<min)
              {
                  min=innersum;
              }
              if(innersum==tar)
              {
                  ArrayList<Integer> sub=new ArrayList<>();
                  sub.addAll(Arrays.asList(arr[s], arr[s1], arr[e1], arr[e]));
                  list.add(sub);


              }
              e1--;
              s1++;
          }
          if(min<tar) {
              s++;
          }
          else if(min>tar) {
              e--;
          }
          else
          {
              e--;
              s++;
          }
          min=111111111;
      }

        return list;
    }

}

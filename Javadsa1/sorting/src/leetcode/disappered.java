package leetcode;

import java.util.*;

public class disappered {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>r=disappear(arr);
        System.out.println(r);
    }
    static ArrayList<Integer> disappear(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
          if(arr[0]!=1)
          {
              int k=1;
              while(k<arr[0])
              {
                  list.add(k);
                  k++;
              }
          }

            for(int i=0;i<arr.length-1;i++)
            {
                if(!(arr[i+1]-arr[i]==1 || arr[i+1]-arr[i]==0))
                {
                    int k=arr[i]+1;
                    while(k<arr[i+1])
                    {
                        list.add(k);
                        k++;
                    }
            }

        }
            if(arr[arr.length-1]!=arr.length)
            {
                list.add(arr.length);
            }
            return list;
    }
}

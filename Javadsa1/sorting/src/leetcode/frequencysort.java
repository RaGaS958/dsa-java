package leetcode;

import java.util.*;

public class frequencysort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int [] res= freqSort(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] freqSort(int arr[])
    {
        Arrays.sort(arr);
        int res[]=new int[arr.length];
        int k=0;
        int freq=1;
        ArrayList<Integer> list=new ArrayList<>();
        while( k<arr.length && freq<arr.length+1)
        {

            for(int i=0;i<arr.length;i++)
            {

                if(freq(arr,arr[i],i)==freq)
                {
                    insertion(arr[i],freq,list);

                }
                i+=freq(arr,arr[i],i)-1;

            }
            Collections.sort(list, Collections.reverseOrder());
            for(int j=0;j<list.size();j++)
            {
                res[k]=list.get(j);
                k++;
            }
            list.clear();

            freq++;
        }
        return res;

    }
    static void insertion(int tar,int freq,ArrayList<Integer> list)
    {
        int i=0;
        while(i<freq)
        {
            list.add(tar);
            i++;
        }
    }
    static int freq(int [] arr,int tar,int s)
    {
        int c=1;

        while( s<arr.length-1 && arr[s+1]==tar)
        {
            c++;
            s++;
        }
        return c;
    }
}

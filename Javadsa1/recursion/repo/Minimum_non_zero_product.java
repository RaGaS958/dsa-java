//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Minimum_non_zero_product {
//    public static void main(String[] args) {
//        int p=1;
//        int size=(int)(Math.pow(2,p))-1;
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++)
//        {
//            arr[i]=i+1;
//        }
//        int min=min_pro(arr);
//        System.out.println(min);
//    }
//    static int min_pro(int arr[])
//    {
//        ArrayList<Integer> list=pro(arr,0);
//        return Collections.min(list);
//    }
//    static ArrayList<Integer> pro(int arr[],int level)
//    {
//        if(level>arr.length)
//        {
//            ArrayList<Integer> list=new ArrayList<>();
//            int pro=1;
//            for(int i=0;i<arr.length;i++)
//            {
//                pro=pro*arr[i];
//            }
//            list.add(pro);
//            return list;
//        }
//        ArrayList<Integer> outer=new ArrayList<>();
//
//    }
//}

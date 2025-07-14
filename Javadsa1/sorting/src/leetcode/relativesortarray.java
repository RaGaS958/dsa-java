package leetcode;
import java.util.*;
public class relativesortarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of unsorted array=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements in unsorted array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of relative array=");
        int m=sc.nextInt();
        System.out.print("Enter the elements in relative array:-");
        int rel[]=new int[m];
        for(int i=0;i<m;i++) {
            rel[i] = sc.nextInt();
        }
        relativeSorting(arr,rel);
        System.out.println(Arrays.toString(arr));
    }
    static void relativeSorting(int [] arr,int [] rel)
    {
        Arrays.sort(arr);
        int last=0;
        for(int i=0;i<rel.length;i++)
        {
            int key=rel[i];
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]==key )
                {
                    int temp=arr[j];
                    arr[j]=arr[last];
                    arr[last]=temp;
                    last++;
                }

            }

        }
    }


}

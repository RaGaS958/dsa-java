package leetcode;
import java .util.*;
public class cookiechild {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list of child grit:-");
        int n = sc.nextInt();
        int child[] = new int[n];
        System.out.print("Enter the grit  of each child:-");
        for (int i = 0; i < n; i++) {
            child[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the list of cookie size:-");
        int m = sc.nextInt();
        int cookie[] = new int[m];
        System.out.print("Enter the size  of each cookie:-");
        for (int i = 0; i < m; i++) {
            cookie[i] = sc.nextInt();
        }
        System.out.println(maxCookie(child,cookie));
    }
    static int maxCookie(int child[],int cookie[])
    {
        Arrays.sort(child);
        Arrays.sort(cookie);
        int counter=0;
        int i=0;
        int j=0;
        while(i<child.length && j<cookie.length)
        {
            if(cookie[j]>=child[i])
            {
                counter++;
            }
            i++;
            j++;
        }
        return counter;
    }

}

import java.util.Arrays;

public class maze_6 {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=-1;
            }
        arr[0][0]=0;
        maze("",0,0,arr,0);
    }
    static void maze(String pr,int r,int c,int arr[][],int count)
    {
        if(r==arr.length-1 && c==arr[0].length-1)
        {
            arr[r][c]=count;
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println(pr);
            arr[r][c]=-1;
            return;
        }
        if(((r<arr.length) &&(c<arr[0].length)) && arr[r][c]==404  )
        {
            return;
        }
        arr[r][c]=count;
        if(r<arr.length-1 && arr[r+1][c]==-1)
        {

            maze(pr+"B",r+1,c,arr,count+1);
        }
        if(c<arr[0].length-1 && arr[r][c+1]==-1)
        {
            maze(pr+"R",r,c+1,arr,count+1);
        }
        if(r>0 && arr[r-1][c]==-1)
        {

            maze(pr+"U",r-1,c,arr,count+1);
        }
        if(c>0 && arr[r][c-1]==-1)
        {
            maze(pr+"L",r,c-1,arr,count+1);
        }
        if(r<arr.length-1 && c<arr[0].length-1 && arr[r+1][c+1]==-1)
        {
            maze(pr+"D",r+1,c+1,arr,count+1);

        }
        arr[r][c]=-1;
    }
}

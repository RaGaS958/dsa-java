public class maze_3 {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        arr[1][1]=-1;
        maze("",0,0,arr);
    }
    static void maze(String pr,int r,int c,int arr[][])
    {
        if(r==arr.length-1 && c==arr[0].length-1) {
            System.out.println(pr);
            return;
        }
        if(((r<arr.length) &&(c<arr[0].length)) && arr[r][c]==-1 )
        {
            return;
        }
        if(r<arr.length-1 )
        {
            maze(pr+"D",r+1,c,arr);
        }
        if(c<arr[0].length-1 )
        {
            maze(pr+"R",r,c+1,arr);
        }
    }
}

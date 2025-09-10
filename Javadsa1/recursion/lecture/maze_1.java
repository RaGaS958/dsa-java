public class maze_1 {
    public static void main(String[] args) {
        maze("",0,0);
    }
    static void maze(String pr,int r,int c)
    {
        if(r==3 && c==3)
        {
            System.out.println(pr);
            return;
        }
        if(r<4)
        {
            maze(pr+"D",r+1,c);
        }
        if(c<4)
        {
            maze(pr+"R",r,c+1);
        }
    }
}

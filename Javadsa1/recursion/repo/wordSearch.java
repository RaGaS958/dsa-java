public class wordSearch {
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','A','E','E'}};
        System.out.println(search(board,"FCSE"));

    }
    static boolean search(char board[][],String up)
    {

      for( int i=0;i<board.length;i++)
      {
          for(int j=0;j<board[0].length;j++)
          {
              if(roam(board,up,i,j))
              {
                  return true;
              }
          }
      }
      return false;
    }
    static boolean roam(char [][]board,String up,int row,int col)
    {
        if(up.isEmpty())
        {
            return true;
        }
        if(row == board.length || col==board[0].length)
        {
            return false;
        }
        boolean val1=false;
        boolean val2=false;
        if(board[row][col]==up.charAt(0))
        {
            if(row< board.length )
            {
               val1= roam(board,up.substring(1),row+1,col);
            }
            if(col<board[0].length)
            {
               val2= roam(board,up.substring(1),row,col+1);
            }

        }
        return val1 | val2;

    }
}

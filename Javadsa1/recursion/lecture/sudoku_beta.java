public class sudoku_beta {
    public static void main(String[] args) {
        int [][]board={
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudokuBeta(board,0,0);
    }
    static void sudokuBeta(int [][]board,int row,int col)
    {
        if(row==board.length)
        {
            display(board);
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();
            return;
        }
        if(col< board[0].length )
        {
            if(board[row][col]==0) {
                for (int i = 1; i < 10; i++) {
                    if (isSafe(board, i,row,col)) {
                        board[row][col] = i;
                        sudokuBeta(board, row, col + 1);
                        board[row][col] = 0;
                    }
                }
            }
            else
            {
                sudokuBeta(board,row,col+1);

            }
        }
         else
        {
            sudokuBeta(board,row+1,0);

        }

    }
    static boolean isSafe(int [][]board,int tar,int row,int col)
    {
        for(int i=0;i<board[0].length;i++)
        {
            if(board[row][i]==tar)
            {
                return false;
            }
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==tar)
            {
                return false;
            }
        }
        return true;
    }
    static void display(int [][]board)
    {
        for(int arr[]:board)
        {
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

public class NKnights {
    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];
        nKnights(board, 0);

    }

    static void nKnights(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                nKnights(board, row + 1);
                board[row][i] = false;

            }
        }

        return;

    }

    static boolean isSafe(boolean board[][], int row, int col) {


            if (row-1>-1 && (col+2)<board[0].length) {
                if (board[row-1][col+2]) {
                    return false;

                }

            }
        if (row-1>-1 && (col-2)>-1){
            if (board[row-1][col-2]) {
                return false;

            }

        }
        if (row-2>-1 && (col-1)>-1) {
            if (board[row-2][col-1]) {
                return false;

            }

        }
        if (row-2>-1 && (col+1)<board[0].length) {
            if (board[row-2][col+1]) {
                return false;

            }

        }





        return true;
    }

    static void display(boolean board[][]) {
        for (boolean arr[] : board) {
            for (boolean col : arr) {
                if (col) {
                    System.out.print("K ");

                } else {
                    System.out.print("__ ");
                }
            }
            System.out.println();
        }

    }
}

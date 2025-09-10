public class NBisops {
    public static void main(String[] args) {
        boolean board[][] = new boolean[8][8];
        nBisops(board, 0);

    }

    static void nBisops(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                nBisops(board, row + 1);
                board[row][i] = false;

            }
        }

        return;

    }

    static boolean isSafe(boolean board[][], int row, int col) {
        int i = row;
        int j = col;
        int k = col;
        while (i > 0) {
            --i;
            --j;
            k++;
            if (j > 0) {
                if (board[i][j]) {
                    return false;

                }
            }

            if (k < board[0].length) {
                if (board[i][k]) {
                    return false;

                }
            }

        }

        return true;
    }

    static void display(boolean board[][]) {
        for (boolean arr[] : board) {
            for (boolean col : arr) {
                if (col) {
                    System.out.print("B ");

                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}

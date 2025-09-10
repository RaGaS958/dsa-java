public class NRook {
    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];
        nRook(board, 0);

    }

    static void nRook(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                nRook(board, row + 1);
                board[row][i] = false;

            }
        }

        return;

    }

    static boolean isSafe(boolean board[][], int row, int col) {
        int i = row;
        while (i > 0) {
            --i;
            if (board[i][col]) {
                return false;

            }

        }

        return true;
    }

    static void display(boolean board[][]) {
        for (boolean arr[] : board) {
            for (boolean col : arr) {
                if (col) {
                    System.out.print("R ");

                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}

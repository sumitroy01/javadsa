public class d_Nqueens {

    public static void main(String[] args) {
        int n = 5;                 // try 3 (no solutions) or 4 (2 solutions)
        boolean[][] board = new boolean[n][n];
        System.out.println("Total solutions: " + queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "q " : "x ");
            }
            System.out.println(); // end of row
        }
        System.out.println(); // blank line between boards
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int n = board.length;

        // check column above
        for (int r = 0; r < row; r++) {
            if (board[r][col]) return false;
        }

        // check upper-left diagonal
        int r = row - 1, c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) return false;
            r--; c--;
        }

        // check upper-right diagonal
        r = row - 1; c = col + 1;
        while (r >= 0 && c < n) {
            if (board[r][c]) return false;
            r--; c++;
        }

        return true;
    }
}

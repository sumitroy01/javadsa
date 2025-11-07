public class e_Nknights {

    public static void main(String[] args) {
        int n = 3;             // board size (n x n)
        int knightsToPlace = 2;
        boolean[][] board = new boolean[n][n];

        int total = placeKnights(board, 0, 0, knightsToPlace);
        System.out.println("Total solutions: " + total);
    }

    // returns number of ways to place `knightsLeft` knights starting from (r,c)
    static int placeKnights(boolean[][] board, int r, int c, int knightsLeft) {
        int n = board.length;

        // placed all knights -> display one valid arrangement
        if (knightsLeft == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        // reached end of rows -> no more placements
        if (r == n) return 0;

        // move to next row if column past end
        if (c == n) return placeKnights(board, r + 1, 0, knightsLeft);

        int count = 0;

        // try placing knight at (r,c) if safe
        if (isSafe(board, r, c)) {
            board[r][c] = true;
            count += placeKnights(board, r, c + 1, knightsLeft - 1);
            board[r][c] = false;
        }

        // also try NOT placing at (r,c)
        count += placeKnights(board, r, c + 1, knightsLeft);

        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        int n = board.length;
        // all possible knight moves (8)
        int[][] moves = {
            {-2, -1}, {-2,  1}, {-1, -2}, {-1,  2},
            { 1, -2}, { 1,  2}, { 2, -1}, { 2,  1}
        };

        for (int[] m : moves) {
            int nr = r + m[0];
            int nc = c + m[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                if (board[nr][nc]) return false;
            }
        }
        return true;
    }
    
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "k " : "x ");
            }
            System.out.println();
        }
    }
}



// // returns true if (r,c) is inside the board
// private static boolean isValid(boolean[][] board, int r, int c) {
//     int n = board.length;
//     return r >= 0 && r < n && c >= 0 && c < n;
// }

// // returns true if no existing knight can attack (r,c)
// private static boolean isSafe(boolean[][] board, int r, int c) {
//     // up-left moves
//     if (isValid(board, r - 2, c - 1)) {
//         if (board[r - 2][c - 1]) return false;
//     }
//     if (isValid(board, r - 1, c - 2)) {
//         if (board[r - 1][c - 2]) return false;
//     }

//     // up-right moves
//     if (isValid(board, r - 2, c + 1)) {
//         if (board[r - 2][c + 1]) return false;
//     }
//     if (isValid(board, r - 1, c + 2)) {
//         if (board[r - 1][c + 2]) return false;
//     }

//     // down-left moves
//     if (isValid(board, r + 2, c - 1)) {
//         if (board[r + 2][c - 1]) return false;
//     }
//     if (isValid(board, r + 1, c - 2)) {
//         if (board[r + 1][c - 2]) return false;
//     }

//     // down-right moves
//     if (isValid(board, r + 2, c + 1)) {
//         if (board[r + 2][c + 1]) return false;
//     }
//     if (isValid(board, r + 1, c + 2)) {
//         if (board[r + 1][c + 2]) return false;
//     }

//     return true;
// }

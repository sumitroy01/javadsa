public class c_backtracking {

    public static void main(String[] args) {
        boolean[][] maze = {
            { true,  true,  true },
            { true,  true,  true },
            { true,  true,  true }
        };

        printPathDiagonal("", maze, 0, 0);
    }

    static void printPathDiagonal(String p, boolean[][] maze, int r, int c) {
        int rows = maze.length;
        int cols = maze[0].length;

        
        if (r < 0 || c < 0 || r >= rows || c >= cols || !maze[r][c]) {
            return;
        }

       
        if (r == rows - 1 && c == cols - 1) {
            System.out.println(p);
            return;
        }

       
        maze[r][c] = false;

        // do
        printPathDiagonal(p + 'd', maze, r + 1, c);
        // ri
        printPathDiagonal(p + 'r', maze, r, c + 1);
        // up
        printPathDiagonal(p + 'u', maze, r - 1, c);
        // lef
        printPathDiagonal(p + 'l', maze, r, c - 1);

        // 
        maze[r][c] = true;
    }
}









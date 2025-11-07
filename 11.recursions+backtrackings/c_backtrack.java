
import java.util.Arrays;

public class c_backtrack {

    public static void main(String[] args) {
        boolean[][] maze = {
            { true,  true,  true },
            { true,  true,  true },
            { true,  true,  true }
        };
        int[][] path=new int[maze.length][maze[0].length];
        printPathDiagonal("", maze, 0, 0,path,1);
    }

    static void printPathDiagonal(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        int rows = maze.length;
        int cols = maze[0].length;

        
        if (r < 0 || c < 0 || r >= rows || c >= cols || !maze[r][c]) {
            return;
        }

       
        if (r == rows - 1 && c == cols - 1) {
            path[r][c]=step;
            for (int[] arr : path) {
                
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

       
        maze[r][c] = false;
        path[r][c]=step;

        // do
        printPathDiagonal(p + 'd', maze, r + 1, c,path,step+1);
        // ri
        printPathDiagonal(p + 'r', maze, r, c + 1,path,step+1);
        // up
        printPathDiagonal(p + 'u', maze, r - 1, c,path,step+1);
        // lef
        printPathDiagonal(p + 'l', maze, r, c - 1,path,step+1);

        // 
        maze[r][c] = true;
         path[r][c]=0;
    }
}









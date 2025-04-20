public class a2_recurpattern {
    public static void main(String[] args) {
        print(4, 4);        
    }

    static void print(int row, int col) {
        if (row == 0) {
            return; // base case to stop recursion
        }

        if (col < row) {
            System.out.print("x");         // print "x" without a new line
            print(row, col + 1);           // move to next column
        } else {
            System.out.println();          // print a new line
            print(row - 1, 0);             // go to next row, reset column to 0
        }
    }
}

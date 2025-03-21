//searching for a max value in 2d array

import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int[][] arr2d = { { 1, 2, 3 }, { 3, 4 }, { 4, 5, 6, 7 }, { 8, 9 } };
        int[] indexofmax = ls(arr2d);
        System.out.println(Arrays.toString(indexofmax));
    }

    static int[] ls(int[][] arr2d) {
        int min = Integer.MIN_VALUE;
        int maxrow = -1;
        int maxcol = -1;

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                if (arr2d[row][col] > min) {
                    min = arr2d[row][col];
                    maxcol = col;
                    maxrow = row;
                }
            }
        }

        return new int[] { maxrow, maxcol };
    }
}

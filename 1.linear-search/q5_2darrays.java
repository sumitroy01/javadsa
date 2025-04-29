//search in 2d arrays{{1,2,3,4},{5,6,7},{8,9},{10}}

import java.util.Arrays;

public class q5_2darrays {
    public static void main(String[] args) {
        int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 }, { 10 } };
        int target = 7;
        int[] iot = ls(arr2d, target);
        System.out.println(Arrays.toString(iot));

    }

    static int[] ls(int[][] arr, int target) {
        if (arr.length == 0) {
            
            return new int[] { -1, -1 };
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }

        return new int[] { -1, -1 };

    }
}

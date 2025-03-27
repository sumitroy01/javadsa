public class m2darray {

    public static void main(String[] args) {
        int[][] arr2d = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 29;
        int[] index = binarySearch2D(arr2d, target);

        if (index[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at: (" + index[0] + ", " + index[1] + ")");
        }
    }

    static int[] binarySearch2D(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col }; // Found target
            } else if (matrix[row][col] < target) {
                row++; // Move downward
            } else {
                col--; // Move left
            }
        }

        return new int[] { -1, -1 }; // Not found
    }
}

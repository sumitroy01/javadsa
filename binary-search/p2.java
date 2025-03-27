public class p2 {

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

    static int[] binarySearch2D(int[][] arr2d, int target) {
        for (int row = 0; row < arr2d.length - 1; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {

                if (arr2d[row][col] == target) {
                    return new int[] { row, col };
                } else if (arr2d[row][col] > target) {
                    row--;
                } else {
                    col++;
                }

            }
        }
        return new int[] { -1, -1 };

    }
}

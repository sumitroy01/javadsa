import java.util.Arrays;

public class a17_FlipTheImage {
    public static void main(String[] args) {
        int[][] my2darr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        flipAndInvert(my2darr);

        // Print the modified 2D array
        for (int[] row : my2darr) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void flipAndInvert(int[][] arr2d) {
        for (int[] eachblock : arr2d) {
            // Reverse the row
            reverseArray(eachblock);
            // Invert the bits
            for (int i = 0; i < eachblock.length; i++) {
                eachblock[i] = (eachblock[i] == 0) ? 1 : 0; // Flip 1 → 0 and 0 → 1
            }
        }
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

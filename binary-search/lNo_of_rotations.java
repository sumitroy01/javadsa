//count the number of roations done in the array
public class lNo_of_rotations {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        int number_of_rotation = findPivot(arr);
        System.out.println("The number of rotations done here were: " + (number_of_rotation + 1));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust search space
            if (arr[mid] >= arr[start]) { // Move right
                start = mid + 1;
            } else { // Move left
                end = mid - 1;
            }
        }

        return 0; // If no rotation found, return 0 (sorted array)
    }
}

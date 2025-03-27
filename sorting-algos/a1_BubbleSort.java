public class a1_BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 1, 9 };

        bubbleSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false; // Reset swapped before inner loop

            for (int j = 1; j < arr.length - i; j++) { // Start from 1 to avoid out-of-bounds
                if (arr[j] < arr[j - 1]) { // Compare adjacent elements
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true; // Set swapped if swap happened
                }
            }

            // If no swaps happened, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}

public class a2_selection_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 1, 8, 0 };
        selectionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Run till second last element
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) { // Fixed function signature
        int max = start;
        for (int i = start; i <= end; i++) { // Find max index in the range
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}

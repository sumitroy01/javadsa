public class a3_InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 1, 8, 0, -100 };
        insertionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            for (int j = i; j > 0; j--) { // Move backwards
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class b2_alldisapperdnums {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 10, 8 };
        cylic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cylic(int[] arr) {
        int start = 0;
        int end = arr.length;
        ArrayList<Integer> sarr = new ArrayList<>();
        while (start < end) {
            int original_index = arr[start] - 1;
            if (arr[start] != arr[original_index] && end > original_index) {
                swap(arr, start, original_index);

            } else {
                start++;
            }

            // [1, 2, 3, 4, 3, 2, 7, 8]
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                sarr.add(i + 1);
            }

        }

        System.out.println(sarr + "here");
    }

    static void swap(int[] arr, int start, int original_index) {
        int temp = arr[start];
        arr[start] = arr[original_index];
        arr[original_index] = temp;
    }
}

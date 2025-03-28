import java.util.Arrays;

public class a4_cyclic_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int element_default = arr[i] - 1;
            if (arr[i] != arr[element_default]) {
                swap(arr, i, element_default);

            } else {
                i++;
            }

        }

    }

    static void swap(int[] arr, int current, int original) {
        int temp = arr[current];
        arr[current] = arr[original];
        arr[original] = temp;

    }
}

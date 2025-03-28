//input 1,2,2,4 output; 2,3 the duplli and the missing

import java.util.Arrays;

public class b5_setmismatch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 1, 2, 2 };
        int[] newar = cyclic(arr);
        System.out.println(Arrays.toString(newar));

    }

    static int[] cyclic(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int correctindex = arr[start] - 1;
            if (arr[start] != arr[correctindex] && end > arr[correctindex]) {
                swap(arr, start, correctindex);
            } else {
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {

                return new int[] { arr[i], i + 1 };

            }
        }
        return new int[] { -1, -1 };

    }

    static void swap(int[] arr, int start, int correctindex) {
        int temp = arr[correctindex];
        arr[correctindex] = arr[start];
        arr[start] = temp;
    }
}

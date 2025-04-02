import java.util.Arrays;

public class b3_finddupli_amz {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int correctindex = arr[start] - 1;
            if (arr[start] != arr[correctindex] && end > correctindex) {
                swap(arr, start, correctindex);
            } else {
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(arr[i] + " : is the  duplicate  number");

            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}
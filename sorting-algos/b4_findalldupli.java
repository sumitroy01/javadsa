import java.util.ArrayList;
import java.util.Arrays;

public class b4_findalldupli {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr) {
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

        ArrayList<Integer> myarr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1 && !myarr.contains(arr[i])) {
                myarr.add(arr[i]);
            }
        }
        // [1, 2, 3, 4, 3, 2, 7, 8]
        System.out.println("duplicate array are : " + myarr);
    }

    static void swap(int[] arr, int start, int correctindex) {
        int temp = arr[start];
        arr[start] = arr[correctindex];
        arr[correctindex] = temp;
    }
}

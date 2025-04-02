//amazon interview 
//leetcode hard 
//samllest postive missing number
//[3,4,-1,1] --> ans =2

import java.util.Arrays;

public class b6_smlst_pstv_amz {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int correctindex = arr[start] - 1;
            if (arr[start] > 0 && arr[start] <= end && arr[start] != arr[correctindex]) {
                swap(arr, start, correctindex);
            } else {
                start++; // Move forward if already correct or if -1 is encountered
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {
                System.out.println(i + 1 + " is the missing number");
            }
        }
    }

    static void swap(int[] arr, int correctindex, int start) {
        int temp = arr[correctindex];
        arr[correctindex] = arr[start];
        arr[start] = temp;
    }
}

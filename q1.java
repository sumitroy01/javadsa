//q1 in given arr=[18,12,9,14,77,50] find the number 14

import java.util.Arrays;

public class q1 {

    public static void main(String[] args) {
        int[] nums = { 23, 45, 14, 16, 7, 15 };
        int target = 14;
        int indexans = ls(nums, target);
        System.out.println("the index of the target elemnt is :" + indexans + " And the number is :" + nums[indexans]);
    }

    static int ls(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
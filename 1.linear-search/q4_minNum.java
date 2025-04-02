//minimum number or lowest number in the arr

public class q4_minNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, -5, 8, 9, 10, 0, 12, -1 };
        int lowest_number = ls(arr);
        System.out.println(lowest_number + ";is the lowest number in this array");
    }

    static int ls(int[] arr) {
        if (arr.length < 0) {
            return -1;

        }
        int maxvalue = Integer.MAX_VALUE;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < maxvalue) {
                maxvalue = arr[index];
            }
        }

        return maxvalue;

    }
}

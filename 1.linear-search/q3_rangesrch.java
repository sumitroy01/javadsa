//search for a target in a range a-b 
public class q3_rangesrch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int start = 3;
        int end = 7;
        int target = 5;
        int indexofnumber = ls(arr, start, end, target);
        if (indexofnumber >= 0) {
            System.out.println("element is found at index :" + indexofnumber);
        } else {
            System.out.println("element is not found");

        }

    }

    static int ls(int[] arr, int start, int end, int target) {
        if (arr.length <= 0) {
            return -1;

        }

        for (int index = start; index < end; index++) {
            if (target == arr[index]) {
                return index;
            }
        }

        return -1;
    }
}

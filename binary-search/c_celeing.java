//celeing of a number;_> smallest number>=target
//
public class c_celeing {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 7, 9, 11, 15 };
        int target = 1;
        if (target > arr[arr.length - 1]) {
            System.out.println("the number doesnt exists in the given array");
        } else {

            int indexof = bs(arr, target);
            System.out.println(indexof + "is the index of " + arr[indexof] + " which is celing of " + target);
        }
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }
}

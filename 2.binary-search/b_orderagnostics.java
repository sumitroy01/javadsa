//binary search for order agnostics
public class b_orderagnostics {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] acenarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
        int target = 4;
        int indexof = bs(arr, target);
        int indexof2 = bs(acenarr, target);
        System.out.println(indexof + " : is of decending orderone  &&  " + indexof2 + " : is of acending order");

    }

    static int bs(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isacend;
        if (arr[start] > arr[end]) {
            isacend = false;
        } else {
            isacend = true;
        }

        if (!isacend) {

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;

                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
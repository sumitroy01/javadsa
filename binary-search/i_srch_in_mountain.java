//find element in mounatin array 
public class i_srch_in_mountain {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 6, 4, 2 };
        int peak = peakelement(arr);
        System.out.println("peak element is:" + arr[peak]);
        int start = peak;
        int end = arr.length - 1;
        int result1 = bs(arr, 0, peak, true, 3);
        int result = bs(arr, start, end, false, 4);
        System.out.println(result + " : is the result for target = 4");
        System.out.println(result1 + " : is the result of target =3");
    }

    static int peakelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    static int bs(int[] arr, int start, int end, boolean ascending, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ascending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;

                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;

    }
}
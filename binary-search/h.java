public class h {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 6, 4, 3, 2, 1 };
        int indexof = peakIndexInMountainArray(arr);
        System.out.println("Peak element index: " + indexof);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // We are in the decreasing part, so the peak is at mid or before it
                end = mid;
            } else {
                // We are in the increasing part, so the peak is ahead
                start = mid + 1;
            }
        }
        // Start and end will eventually point to the peak index
        return start;
    }
}

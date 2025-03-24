public class g {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int target = 19;
        int index = findPosition(arr, target);

        System.out.println("Index of target: " + index);
    }

    static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;
        try {
            while (target > arr[end]) {
                int nstart = end + 1;
                end = end + (end - start + 1) * 2;
                start = nstart;

            }

        } catch (Exception e) {
            System.out.println("your elemnt doesnt exists int the infinite array");
        }
        // Expanding the search range exponentially

        // Perform binary search within the identified range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } catch (Exception e) {
                end = mid - 1; // If arr[mid] is out of bounds, shrink the range
            }
        }
        return -1; // Target not found
    }
}

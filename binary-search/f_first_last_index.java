//first and last index of an occurence

public class f_first_last_index {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] indexes = searchRange(arr, target);

        System.out.println("[" + indexes[0] + ", " + indexes[1] + "]");
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // Potential answer found
                if (findFirst) {
                    end = mid - 1; // Search in the left half for first occurrence
                } else {
                    start = mid + 1; // Search in the right half for last occurrence
                }
            }
        }

        return ans;
    }
}

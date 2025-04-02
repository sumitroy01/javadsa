//roatated array {1,2,3,4,5,6,7} r1--> {7,1,2,3,4,5,6} r2-->{6,7,1,2,3,4,5}
//find thepivot element ie, =7
public class k_Pivot {
    public static void main(String[] args) {
        int[] rarray = { 5, 6, 7, 1, 2, 3, 4 };
        int indexOfPivot = pivotElement(rarray);
        System.out.println("Pivot Index: " + indexOfPivot);
        System.out.println("Pivot Element: " + (indexOfPivot != -1 ? rarray[indexOfPivot] : "Not found"));
    }

    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide where to move
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Pivot not found
    }
}

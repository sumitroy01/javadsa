//floor of a numbr floor is greatestnumber in list <=target
public class d_floorr {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 9, 11, 15, 17 };
        int target = 3;
        if (target < arr[0]) {
            System.out.println("the floor of " + target + " is unaviable in this list");
        } else {

            int indexofloor = bs(arr, target);
            System.out.println(arr[indexofloor] + ": is the floor of your target " + '{' + target + '}');
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

        return end;

    }

}

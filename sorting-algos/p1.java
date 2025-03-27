
public class p1 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, -1, -10, 5, -4, -3, -2, 1, 0 };
        insertion(arr);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }

    }

    static void insertion(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    static void swap(int[] arr, int bigele, int samlele) {
        int temp = arr[bigele];
        arr[bigele] = arr[samlele];
        arr[samlele] = temp;
    }

}

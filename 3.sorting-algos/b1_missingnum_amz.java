//[o -n]
//find missing numbers  [4,0,2,1] missing is 3 should be output

public class b1_missingnum_amz {

    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1, 3, 5, 7 };
        cylic(arr);

    }





    
    static void cylic(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int element_dflt_pos = arr[start];
            if (arr[start] < end && arr[start] != arr[element_dflt_pos]) {
                swap(arr, start, element_dflt_pos);
            } else {
                start++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println(i + " is the missing element");

            }
        }

    }

    static void swap(int[] arr, int start, int originalpos) {

        int temp = arr[start];
        arr[start] = arr[originalpos];
        arr[originalpos] = temp;
    }
}
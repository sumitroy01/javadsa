import java.util.Arrays;

public class a5_selectionsort {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,3};
        ss(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void ss(int[] arr,int start,int end,int max){
        if (end==0){
            return;

        }
       if (end>start) {
        
            max=findmax(arr, start, end);
            swap(arr, end, max);
            ss(arr, start, end-1, max);
           }

    }

    static int findmax(int[] arr,int start,int end){
        int max=start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr,int current,int modified){
        int temp=arr[current];
        arr[current]=arr[modified];
        arr[modified]=temp;

    }
}

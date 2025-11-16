import java.util.Arrays;

public class a4_bubblesort {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,1,2};
       bs(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));

    }

    static void bs(int[] arr,int start,int end){
        if (end==0) {
            return;
        }
        if (start<end) {
            
            if (arr[start]>arr[start+1]) {
                swap(arr,start,start+1);
            }
                bs(arr, start+1, end);
          
            }else{
            bs(arr, 0, end-1);
        }
        

    }
    
    
    static void swap(int [] arr,int current,int modified){
        int temp=arr[current];
        arr[current]=arr[modified];
        arr[modified]=temp;

    }
}

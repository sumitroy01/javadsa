//select sort
public class p2 {
    public static void main(String[] args) {
        int [] arr={ 2, 5, 4, 1,6,7};
        //find a max element 
        // swap it with last index 
        //reduce the last index-size with 1
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    static void selectionSort(int[] arr){
        //0 -- 5
        for (int i = 0; i < arr.length; i++) {
            int ends=arr.length-i-1;
            int maxelemnts_index=getMaxelemnt(arr,0,ends);
            swap(arr,maxelemnts_index,ends);
        }



    }

    static void swap(int[] arr,int current,int maxelemnts_index){
        int temp=arr[current];
        arr[current]=arr[maxelemnts_index];
        arr[maxelemnts_index]=temp;
    }
    //2, 5, 4, 1,6,7

    static int getMaxelemnt(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]) {
              max=i;                
            }
            
        }
        return max;
    }


}

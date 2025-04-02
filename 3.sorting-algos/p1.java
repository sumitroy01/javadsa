public class p1 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 1};

        bubbleSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
    }

}
    // 5--4  5--4 last index 5
    //4 --1 

    static void bubbleSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]<arr[j-1]) {
                swap(arr,j,j-1);
                
            }
        }
    }}

        static void swap(int[] arr,int index1,int index2){
            int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        }




}
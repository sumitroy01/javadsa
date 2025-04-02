public class p4 {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1, 3, 5, 7  };
        cyclic(arr);

        // Print sorted array
      
    }

    static void cyclic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i && arr[i]<arr.length){
                swap(arr,arr[i],i);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] !=j) {
                System.out.println(j+" is the missing element");
            
            }
        }
        
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

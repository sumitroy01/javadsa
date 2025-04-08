//check whether the array is sorted or not..

public class a1_sortedArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int[] arr2={1,2,3,4,5,6,9,7};
        System.out.println(recursorted(arr, 0));
        System.out.println(recursorted(arr2, 0));

    }

    static boolean recursorted(int[] arr,int index){

        if (index ==arr.length-1) {
            return true;
            
        }
      
        return arr[index]<arr[index+1] && recursorted(arr, index+1)   ; 
        
           
       
    }
}
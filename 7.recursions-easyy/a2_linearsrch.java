public class a2_linearsrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int tag=3;
     
        System.out.println(recursrch(arr, tag, 0));

    }

    static int recursrch(int[] arr,int tar,int index){
        if (index>arr.length-1) {
            return -1;
        }

        if (arr[index]==tar) {
            return index;
        }else{
            return recursrch(arr, tar, index+1);
        }
      
      
       
    }
    
}

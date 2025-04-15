public class a5_roatatedbs {
    public static void main(String[] args) {
        int[] arr={7,8,9,10,1,2,3};
        System.out.println(roatetdbs(arr, 0, arr.length-1));
    }
    

    static int roatetdbs(int[]arr ,int start,int end){
        if(start>=end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
            return mid;
        }
        if (arr[mid]>arr[mid]-1) {
            
            return roatetdbs(arr, mid+1, end);
        }else{
            return roatetdbs(arr, start, mid-1);
        }
    }
}

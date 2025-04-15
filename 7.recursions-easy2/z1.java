import java.util.Arrays;

public class z1 {

    public static void main(String[] args) {
        int[] arr={5,4,1,2,0,9,8,7};
        int[] sorted=mergesort(arr);
        System.out.println(Arrays.toString(sorted));

        
    }

    static int[] mergesort(int[]arr){
        if (arr.length<=1) {
            return arr;
        }

        int mid=arr.length/2;
        int[] left =mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    static int[] merge(int[] left,int[] right){
        int[] myarr=new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                myarr[k++]=left[i++];
            }else{
                myarr[k++]=right[j++];
            }
        }

        while (i<left.length) {
            myarr[k++]=left[i++];

        }

        while (j<right.length) {
            myarr[k++]=right[j++];
        }
        return myarr;
    }

}
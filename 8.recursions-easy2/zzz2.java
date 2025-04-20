import java.util.Arrays;

public class zzz2 {
public static void main(String[] args) {
    int[] myarr={99,95,97,100,0};
    int[] sorted=mergesort(myarr);
    System.out.println(Arrays.toString(sorted));
  
    
}

static int[] mergesort(int[] arr){
if (arr.length<=1) {
    return arr;
}

int mid=arr.length/2;

int[] left =mergesort(Arrays.copyOfRange(arr, 0, mid));
int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

return merge(left,right);

}

static int[] merge(int[] left,int[] right){
    int i=0;
    int j=0;
    int k=0;
    int[] myarr=new int[left.length+right.length];
    while (left.length>i && right.length>j) {
        
        if (left[i]>right[j]) {
            myarr[k++]=right[j++];
            
        }else{
            myarr[k++]=left[i++];
        }
    }

    while (left.length>i) {
        myarr[k++]=left[i++];
    }

    while(right.length>j){
        myarr[k++]=right[j++];
    }

    return myarr;
}




}
import java.util.ArrayList;


public class a3_linermulti {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,6,6,6,6,6,9,10};
        recur(arr, 6, 0);
      System.out.println(mylisa);
    }
    
    static ArrayList<Integer> mylisa = new ArrayList<>();
    static void recur(int[] arr,int target,int index){
        if (index==arr.length) {
            return;
        }
        if(arr[index]==target){
            mylisa.add(index);
        }
        recur(arr, target, index+1);
    }}

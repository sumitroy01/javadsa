import java.util.ArrayList;

public class a4_returnAraylis {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,7,8};
        ArrayList<Integer> mylist=new ArrayList<>(10);
        System.out.println( 
        recur(arr, 5, 0, mylist));


    }
    static ArrayList<Integer> recur(int[] arr,int target,int index,ArrayList<Integer> mylist){
        if (arr.length==index) {
            return mylist;
        }

        if (arr[index]==target) {
            mylist.add(index);
        }
        return recur(arr, target, index+1, mylist);
    }

    
}

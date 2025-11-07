// {1,2,1,2,3,4,5,3,4} find the non repating number --> sol=5;

//we know a^a =0; a xor a =0;

public class a2_nonduplicate {
    public static void main(String[] args) {
        int[] arr={11,22,11,22,3,4,555,99,3,4,99};
        findsol(arr);
               
    }
    static void findsol(int[] arr){
        int unique=0;
        for (int i : arr) {
            unique =unique^i;
        }
        System.out.println(unique);
        
    }
    
}

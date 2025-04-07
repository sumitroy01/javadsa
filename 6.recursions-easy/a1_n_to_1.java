public class a1_n_to_1 {

    public static void main(String[] args) {
        int n=5;
        recur(n);
    }

    static void recur(int n){
     if (n==0) {
        return;
     }

        System.out.println(n);
        recur(n-1);
    }
}
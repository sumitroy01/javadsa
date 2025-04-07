public class a2_1_to_n {
    public static void main(String[] args) {
        int n=5;
        recur(n);
    }
    static void recur(int n){
        if (n==0) {
            return;
        }
        recur(n-1);
        System.out.println(n);
    }
    
}

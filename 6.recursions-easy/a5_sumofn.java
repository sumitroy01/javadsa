public class a5_sumofn {
    public static void main(String[] args) {
        int num=10;
        System.out.println(sumof(num));
       
    }
    
    static int sumof(int n){
        if (n<=1) {
            return 1;
        }

        return n+sumof(n-1);

    }
}

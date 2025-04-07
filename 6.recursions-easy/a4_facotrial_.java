public class a4_facotrial_ {
    public static void main(String[] args) {
        int num=1;
        System.out.println(facto(num));

    }

    static int facto(int n){
       if (n<=1) {
        return 1;
       }
        return n*facto(n-1);

    }
    
}

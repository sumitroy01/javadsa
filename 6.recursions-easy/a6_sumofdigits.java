public class a6_sumofdigits {
    public static void main(String[] args) {
        int num=0;
        System.out.println(sod(num));
    }
    static int sod(int n){
        if (n/10==0) {
            return n;
            
        }
        return n%10 +sod(n/10);
    }
}

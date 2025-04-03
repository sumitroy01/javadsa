public class a6_gcd {
    public static void main(String[] args) {
        int result = gcd(5, 10);
        System.out.println("GCD: " + result);
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}

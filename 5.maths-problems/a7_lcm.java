public class a7_lcm {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + result);
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; // Avoids integer overflow
    }
}

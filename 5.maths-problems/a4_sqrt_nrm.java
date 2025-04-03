public class a4_sqrt_nrm {

    

    static double sqrt(double n) {
        double x = n;
        double root;
        
        while (true) {
            root = 0.5 * (x + (n / x));  // Newton-Raphson formula

            if (Math.abs(root - x) < 1e-6) {  // Stop when the difference is very small
                break;
            }

            x = root;  // Update x for next iteration
        }

        return root;
    }

    public static void main(String[] args) {
        double n = 40;
        System.out.println("Square root of " + n + " is: " + sqrt(n));
    }
}

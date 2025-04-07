public class a3_squareroot {
    public static void main(String[] args) {
        int n = 10;
        int precision = 3;
        double result = sqrt(n, precision);
        System.out.println("Square root of " + n + " with precision " + precision + " is: " + result);
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        // Binary search for the integer part
        while (start <= end) {  // Fixed condition
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;  // Perfect square case
            } else if (mid * mid < n) {
                root = mid; // Store the potential answer
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Precision handling
        double adder = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += adder;
            }
            root -= adder; // Correct overshoot
            adder /= 10;   // Move to next decimal place
        }

        return root;
    }
}

public class A2_PrimeNum_Sieve {

    static void sieve(int n) {
        boolean[] primes = new boolean[n + 1]; // Initialize array

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) { // Start from i*i
                    primes[j] = true;
                }
            }
        }

        // Print prime numbers
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; // Example: Find primes up to 50
        sieve(n);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class a5_factors {
    public static void main(String[] args) {
        int n = 20;

        // **Brute force method**
        System.out.println("Brute Force Factors:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // **Optimized method using square root**
        System.out.println("Optimized Factors:");
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) { // If it's a perfect square
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + (n / i) + " ");
                    list.add(n / i);
                }
            }
        }

        // Sorting the list and printing remaining factors
        Collections.sort(list);
        for (int factor : list) {
            System.out.print(factor + " ");
        }
    }
}

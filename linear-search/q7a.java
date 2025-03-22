//optimized solution for number of digits

public class q7a {
    public static void main(String[] args) {
        int[] arrs = { 11, 123, 1111, 1234, 1, 10 };
        int counter = 0;
        for (int num : arrs) {
            int currntnum = (int) (Math.log10(num) + 1);
            if (currntnum % 2 == 0) {
                counter++;
            }
        }
        System.out.println("the count of even digit number are " + counter);
    }
}

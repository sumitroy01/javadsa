public class a8_reverse_anum {
    static int sum = 0; // needs to be static to access in static method

    public static void main(String[] args) {
        int num = 1234;
        int reversed = ran(num);
        System.out.println(reversed);
    }

    static int ran(int num) {
        if (num == 0) {
            return sum;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;
        return ran(num / 10); // recursive call
    }
}

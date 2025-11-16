public class a08_ntimerepeating {
    public static void main(String[] args) {
     int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4};
     int ones = 0, twos = 0;

    for (int num : arr) {
    ones = (ones ^ num) & ~twos;
    twos = (twos ^ num) & ~ones;
}

System.out.println(ones); // prints 4

    }
}

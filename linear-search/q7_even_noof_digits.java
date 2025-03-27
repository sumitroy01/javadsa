//even digits eg: nums=[18,1429,111,98,555,100], here search for the even digits such as 18,1429,38 and return the count
//solving using brute froce approach

public class q7_even_noof_digits {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 18, 1429, 111, 98, 555, 100 };
        for (int eachelementof : arr) {
            if (iseven(eachelementof)) {
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean iseven(int num) {

        int numofdigits = countdigit(num);
        if (numofdigits % 2 == 0) {
            return true;

        }
        return false;
    }

    static int countdigit(int num) {
        int counter = 0;
        while (num > 0) {
            counter++;
            num /= 10;
        }
        return counter;
    }
}

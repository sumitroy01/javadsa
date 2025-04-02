//smallest character ;a character larger than target and wrap around too;

public class e_samllestchar_amazon {
    public static void main(String[] args) {
        char[] chars = { 'c', 'd', 'e', 'g', 'z' };
        char target = 'z';
        int indexof = bs(chars, target);
        System.out.println("smallest charecter of your char [" + target + "] is :" + chars[indexof]);
    }

    static int bs(char[] chars, char target) {
        int start = 0;
        int end = chars.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (chars[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return start % chars.length;
    }
}
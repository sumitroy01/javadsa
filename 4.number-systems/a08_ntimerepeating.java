public class a08_ntimerepeating {
    public static void main(String[] args) {
        // Array where all elements except one repeat exactly 3 times
        int[] arr = {1, 1, 1, 2, 2, 2, 5};
        
        // Variables to store the bit occurrences
        int ones = 0, twos = 0;
        
        for (int num : arr) {
            // Update twos and ones using bitwise operations
            twos |= ones & num;  // if a bit appears in both ones and num, add it to twos
            ones ^= num;         // toggle bits in ones
            
            // Remove bits that appear 3 times (both in ones and twos)
            int threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        
        // The non-repeating element will be stored in ones
        System.out.println("The non-repeating element is: " + ones);
    }
}

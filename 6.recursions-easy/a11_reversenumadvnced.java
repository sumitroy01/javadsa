public class a11_reversenumadvnced {
    
        public static void main(String[] args) {
            int num = 100;
            String reversed = reverseWithLeadingZeros(num);
            System.out.println(reversed); // Output: 001
        }
    
        static String reverseWithLeadingZeros(int num) {
            String numStr = String.valueOf(num);
            StringBuilder sb = new StringBuilder(numStr);
            return sb.reverse().toString();
        }
    }
    


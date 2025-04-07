public class a9_palindrome {
    
    
        static int sum = 0; // needs to be static to access in static method
    
        public static void main(String[] args) {
            int num = 123212;
            int reversed = ran(num);
            if (reversed==num) {
                System.out.println("number is palindrome");
            }else{
                System.out.println("not a plindrome nume");
            }
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
    

import java.util.ArrayList;
import java.util.List;
public class a4_lettercombinations {
    
 public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));     
        System.out.println(letterCombinations("203")); 
    }


    private static final String[] MAP = {
        "",     // 0 
        "",     // 1 
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

   

    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        helper(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void helper(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        if (digit < 0 || digit > 9) return; 

        String letters = MAP[digit];
        if (letters.isEmpty()) {
           
            helper(digits, index + 1, current, result);
            return;
        }

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            helper(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1); 
        }
    }
}

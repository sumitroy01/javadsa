import java.util.ArrayList;

public class z1 {
    public static void main(String[] args) {
        String abc = "abc";
        
        // Printing subsets
        System.out.println("Subsets (printed):");
        subset("", abc);

        // Returning subsets in an ArrayList
        System.out.println("\nSubsets (returned as list):");
        ArrayList<String> list = returnArrList("", abc);
        System.out.println(list);
    }

    // Recursive method to print subsets
    static void subset(String returnStr, String original) {
        if (original.isEmpty()) {
            System.out.println(returnStr);
            return;
        }

        char firstChar = original.charAt(0);
        String remains = original.substring(1);

        subset(returnStr + firstChar, remains); // include
        subset(returnStr, remains);             // exclude
    }

    // Recursive method to return subsets as ArrayList
    static ArrayList<String> returnArrList(String returnStr, String original) {
        ArrayList<String> result = new ArrayList<>();
        if (original.isEmpty()) {
            result.add(returnStr);
            return result;
        }

        char firstChar = original.charAt(0);
        String remains = original.substring(1);

        // Include
        result.addAll(returnArrList(returnStr + firstChar, remains));

        // Exclude
        result.addAll(returnArrList(returnStr, remains));

        return result;
    }
}

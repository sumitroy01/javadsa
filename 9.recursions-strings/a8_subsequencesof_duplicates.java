import java.util.*;
public class a8_subsequencesof_duplicates {
        public static void main(String[] args) {
            String str = "abb";
            int n = str.length();
            int total = 1 << n;
    
            Set<String> uniqueSubsequences = new HashSet<>();
    
            for (int i = 0; i < total; i++) {
                StringBuilder subseq = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        subseq.append(str.charAt(j));
                    }
                }
                uniqueSubsequences.add(subseq.toString());
            }
    
            for (String s : uniqueSubsequences) {
                System.out.println(s);
            }
        }
    }
        


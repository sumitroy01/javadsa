public class a7_subsequences_iteration {


    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        int total = 1 << n; // 2^n subsequences

        for (int i = 0; i < total; i++) {
            StringBuilder subseq = new StringBuilder();
            for (int j = 0; j < n; j++) {
                // Check if j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    subseq.append(str.charAt(j));
                }
            }
            System.out.println(subseq);
        }
    }
}

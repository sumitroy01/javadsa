public class a3_permutations_count {
    public static void main(String[] args) {
     int c=   recur("", "abcd");
    System.out.println(c);
    }

    static int  recur(String procesed,String orignal){
        int count=0;
        if (orignal.isEmpty()) {
           
            return 1;
        }

        char let1=orignal.charAt(0);
        String ramins=orignal.substring(1);

        for (int i = 0; i <=procesed.length(); i++) {
            String le1=procesed.substring(0,i);
            String lel=procesed.substring(i);
            count+= recur(le1+let1+lel, ramins);
        }
        return count;
    }
    
}

public class a2_skipwords_ {
    public static void main(String[] args) {
        String myword="sumitapless";
        String out=removeapple( myword);
        System.out.println(out);

    }

    static String removeapple(String original){
        if (original.isEmpty()) {
            return " ";
        }

       
        if (original.startsWith("apple")) {
            return removeapple(original.substring(5));
        }else{
            return original.charAt(0)+removeapple(original.substring(1));
        }
    }
}

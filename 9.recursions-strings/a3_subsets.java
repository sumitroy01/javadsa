public class a3_subsets {
    public static void main(String[] args) {
        String myword="abc";
        gensubsets(" ",myword);
        

    }

    static void gensubsets(String list,String original){
        if (original.isEmpty()) {
            System.out.println(list);
            return;
        }

        char firstchar=original.charAt(0);
        String rest=original.substring(1);

        gensubsets(list+firstchar, rest);
        gensubsets(list, rest);
    }
    
}

public class a1_permutations {

    public static void main(String[] args) {
        String abc="abc";
        permu("", abc);

    }

    static void permu(String returner,String abc){
        if (abc.isEmpty()) {
            System.out.println(returner);
            return;
            
        }

        char firsl=abc.charAt(0);
       
        
        for (int i = 0; i <= returner.length(); i++) {
            String f=returner.substring(0,i);
            String s=returner.substring(i,returner.length());
            permu(f+firsl+s, abc.substring(1));            
        }

    }
}
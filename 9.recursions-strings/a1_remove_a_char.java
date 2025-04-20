//#32..
public class a1_remove_a_char {
   
        public static void main(String[] args) {
            String original = "baccadaaahhhhahahhahahahha";
            String output=removechar("", original);
            System.out.println(output);  
          
            
        }
         static String removechar(String empty,String original){
    
            if (original.isEmpty()) {
                return empty;
            }
    
            char currentChar=original.charAt(0);
    
            if (currentChar=='a') {
                return removechar(empty, original.substring(1));
    
            }else{
                return removechar(empty+currentChar, original.substring(1));
            }
        }
    
}
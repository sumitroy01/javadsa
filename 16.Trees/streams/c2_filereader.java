
import java.io.FileReader;
import java.io.IOException;

public class c2_filereader {
   public static void main(String[] args) {
    try(FileReader fr=new FileReader("fileone.txt")){
        int letters=fr.read();
        while(fr.ready()){
            System.out.println((char)letters);
            letters=fr.read();
        }
   
   
    }catch(IOException e){  
        System.out.println(e.getMessage());

    }
   } 
}

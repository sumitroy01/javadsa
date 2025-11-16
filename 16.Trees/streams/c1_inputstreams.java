import java.io.IOException;
import java.io.InputStreamReader;
public class c1_inputstreams {

    public static void main(String[] args) {
        
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("enter some letters");
            int letters=isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
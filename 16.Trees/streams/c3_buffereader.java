
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c3_buffereader {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed :"+br.readLine());
        
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br =new BufferedReader(new FileReader("second.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    
}

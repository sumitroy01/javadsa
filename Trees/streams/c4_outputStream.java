
import java.io.OutputStreamWriter;

public class c4_outputStream {

    public static void main(String[] args) {
        

        try(OutputStreamWriter osw= new OutputStreamWriter(System.out)) {
            osw.write("hello world");
            osw.write(97);
            osw.write(98);
            osw.write(99);
            osw.write(100);
            osw.write('A');
            osw.write('\n');
            char[] arr="hello world".toCharArray();
            osw.write(arr);



        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
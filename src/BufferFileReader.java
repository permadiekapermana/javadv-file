import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferFileReader {

    private static final String FILENAME ="src/testText.txt";
  
    public static void main(String[] args) {
        try (
        BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

}
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
   public static void main(String[] args) {

    // membaca file pada directory src dengan nama file testText.txt
    File file = new File("src/testText.txt");
    // var fis dgn type data fileinputstream
    FileInputStream fis = null;
    // exception
	try {
        // isi value fis dengan file
        fis = new FileInputStream(file);
        // ini juga bisa
        // fis = new FileInputStream("src/testText.txt");
		System.out.println("Total file size to read (in bytes) : " + fis.available());
		int content;
		while ((content = fis.read()) != -1) {
			// convert filestream to char and display it
			System.out.print((char) content);
        }
    // jika file null, tampilkan exception
	} catch (IOException e) {
        // sama saja seperti system.err
        // System.err.println(e);
		e.printStackTrace();
	} finally {
        // jika file tidak null maka close
		try {
			if (fis != null)
                fis.close();
        // jika null maka tampilkan exception
		} catch (IOException ex) {
            // System.err.println(ex);
			ex.printStackTrace();
		}
  	}
   }
}
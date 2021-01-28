import java.io.*;

public class FileOutput {
    public static void main(String[] args) {
        // buat variabel file output stream dan data output stream
        FileOutputStream fos; 
        DataOutputStream dos;
        try {
            // buat file baru, jika file sudah ada maka akan override
            File file= new File("src/coba.txt");
            // isi variabel fos dengan file baru
            fos = new FileOutputStream(file);
            // isi dos dengan file dari var fos
            dos=new DataOutputStream(fos);
            // write fos dengan method writeBytes
            dos.writeBytes("Hello Java");
        } catch (IOException e) {
            // exception jika gagal
            e.printStackTrace();
        }
    }
}
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class AtributFile {
    public static void main(String[] args) throws Exception{
        // object baru file
        File f = new File("src/peta-jabar.jpg");
        // menampilkan nama file
        tulis("nama File\t\t: "+f.getName());
        // Mengembalikan string pathname canonical dari pathname abstrak 
        tulis("Pathname Canonical\t: "+f.getCanonicalPath());
        // pathname absolut
        tulis("Path Absolut\t\t: "+f.getAbsolutePath());
        // pathname pemanggilan file
        tulis("Path : "+f.getPath());
        // parent dari peta-jabar.jpg
        tulis("Parent : "+f.getParent());        
        // boolean jika ada file/tidak ada file
        tulis((f.exists()?"file ada":"file tidak ada"));
        // ist file ?
        System.out.println();
        tulis(f.getName() + (f.isFile()?"adalah file":"bukan file" ));
        System.out.println();
        // directory bukan ?
        tulis(f.getName()+(f.isDirectory()?"adalh directory":"bukan directory"));
        System.out.println();
        // file dapat dilakukan write ?
        tulis(f.getName()+(f.canWrite()?"dapat ditulis":"tidak dapat ditulis"));
        System.out.println();
        // file dapat dibaca ?
        tulis(f.getName()+(f.canRead()?"dapat dibaca":"tidak dapat dibaca"));

        // tgl modifikasi file dan ukuran file
        Date tangal = new Date();
        tangal.setTime(f.lastModified());
        tulis("Tanggal modifikasi terakhir : "+tangal);
        tulis("Ukuran file : "+f.length()+" byte" );

        // ubah nama file
        f.renameTo(new File("src/jabar.jpg"));

    }

    // method tulis string untuk sysout
    public static void tulis(String str){
        System.out.println(str);
    }

}
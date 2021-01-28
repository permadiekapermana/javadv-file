import java.io.FileInputStream;
import java.io.IOException;
public class ReadFile2 {
    public static void main(String args[]){
        FileInputStream finput=null;
        int data;
        //membuka file
        try{
            finput = new FileInputStream("src/Input.txt");
        }catch(IOException e){}
        //membaca data dari dalam file dan menampilkanya ke layar
        try{
            while((data = finput.read())!=-1){
                //ketika di tampikan data di konversi ketipe char
                System.out.print((char) data);
            }
        }catch(IOException e){}
        try{
                finput.close();
        }catch(IOException e){}
    }
}        
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFile {
    public static void main(String args[]){
        FileOutputStream foutput=null;
        String data="Hello World";
        //membuka file
        try{
            foutput = new FileOutputStream("src/Output.txt");
        }catch(IOException e){}
        //menulis data kedalam file
        try{
            for(int i=0;i<data.length();i++){
                foutput.write((int) data.charAt(i));
            }
        }catch(IOException e){}
        try{
            foutput.close();
        }catch(IOException e){}
    }
}
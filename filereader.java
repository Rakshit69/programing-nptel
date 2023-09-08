import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filereader {
    public static void main(String[] args) {
        try {
            File in = new File("text.txt");
            File out = new File("outp.txt");
            FileReader fr = new FileReader(in);
            
            FileWriter fw = new FileWriter(out);//character
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            } //buffer is used for large file like image 
            
    
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

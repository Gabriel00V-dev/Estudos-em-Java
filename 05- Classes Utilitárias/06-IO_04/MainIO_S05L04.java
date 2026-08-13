import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainIO_S05L04 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("sjdoasjdosaijdoisajdoisajdios");
            bw.newLine(); //serve como um \n 
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainIO_S05L02 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Estudando java... Estudando java.... Estudando java....\n Estudando java... Estudando java...");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

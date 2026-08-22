import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;;

public class MainNIO_S05L08 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

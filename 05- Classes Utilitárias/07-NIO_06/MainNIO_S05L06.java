import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import java.io.File;
import java.io.IOException;

public class MainNIO_S05L06 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes -> Interface criada para dar a possibilidade de utilizar o polimorfismo baseado no SO
        //DosFileAttributes -> Mais voltado pro windows
        //PosixFileAttributes -> Mais voltado pra Unix
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        
        Path path = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        
    }    
}

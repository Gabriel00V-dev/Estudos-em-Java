import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.IOException;

public class MainNIO_S05L12 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta2/subpasta1");
        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
                for(Path file: directoryStream){
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    zipStream.putNextEntry(zipEntry);
                    Files.copy(file, zipStream);
                    zipStream.closeEntry();
                    
                }
                System.out.println("Arquivo criado com sucesso");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

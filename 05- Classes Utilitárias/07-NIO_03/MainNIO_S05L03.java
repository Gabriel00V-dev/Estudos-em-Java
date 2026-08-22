import java.nio.file.Paths;
import java.nio.file.Path;

public class MainNIO_S05L03 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/estudo/java";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./estudo/./java/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }    
}

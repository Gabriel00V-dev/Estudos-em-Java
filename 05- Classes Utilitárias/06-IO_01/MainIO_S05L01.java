import java.io.File;
import java.io.IOException;

public class MainIO_S05L01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            boolean exist = file.exists();
            System.out.println("Created " +isCreated);
            System.out.println("Path " +file.getPath()); //Nome do arquivo
            System.out.println("Path Absoluto " +file.getAbsolutePath()); //Caminho absoluto
            System.out.println("id directory " +file.isDirectory()); //Verifica se é diretorio
            System.out.println("is file " +file.isFile()); //Verifica se é arquivo
            System.out.println("is hidden " +file.isHidden()); //Verifica se arquivo é oculto
            System.out.println("Last modified " + file.lastModified()); //Verifica a ultima modificação em milisegundos
            if(exist){
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.IOException;
public class MainIO_S05L06 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio pasta criado?  " + isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
       
        try{
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("arquivo.txt criado?  " + isFileCreated);

            File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
            boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
            System.out.println("arquivo.txt renomeado?  " + isRenamed);

            File diretorioRenamed = new File("pasta2");
            boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
            System.out.println("Diretorio pasta renomeado?  " + isDiretorioRenamed);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

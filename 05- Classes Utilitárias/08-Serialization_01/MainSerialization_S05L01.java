import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainSerialization_S05L01 {
    public static void main(String[] args) {
     Aluno_S05L01 aluno = new Aluno_S05L01(1L, "Dev", "21231231");
     //serializar(aluno);   
     deserializar();
    }

    private static void serializar(Aluno_S05L01 aluno){
        Path path = Paths.get("pasta2/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta2/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno_S05L01 aluno = (Aluno_S05L01) ois.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

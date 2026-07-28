import java.io.IOException;

public class MainExcecao_S04L09 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){ //chamados na ordem inversa que foram declarados
        try(Leitor1_S04L09 leitor1 = new Leitor1_S04L09(); //Try with resources
            Leitor2_S04L09 leitor2 = new Leitor2_S04L09()){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

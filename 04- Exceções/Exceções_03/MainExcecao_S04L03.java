import java.io.File;
import java.io.IOException;

public class MainExcecao_S04L03 {
    public static void main(String[] args) { 
        criarNovoArquivo(); //IOException: Acesso negado
    }
   
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt"); //Criei uma pasta arquivo e Neguei a permissão para gravar
        
        try{ //Caso aconteça alguma coisa
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        }catch(IOException e){ //pegue aqui - NUNCA DEIXAR CATCH EM BRANCO NUNCA
            e.printStackTrace();
        }
    }
}

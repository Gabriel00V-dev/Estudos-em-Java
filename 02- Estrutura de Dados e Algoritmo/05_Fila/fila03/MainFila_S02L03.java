import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class MainFila_S02L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue <String> lista = new LinkedList<>();
        String[] imp = new String[5];

        //Adicionando documentos na fila
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um documento para imprimir");
            lista.add(sc.nextLine());
        }

        for(int i = 0; i < 5; i++){
            if(!lista.isEmpty()){
            System.out.println("...IMPRIMINDO...");
            System.out.println("Arquivo " + lista.poll() + " Impresso com sucesso, arquivos restantes.. " + lista.size());
            }
        }
        System.out.println("Impressões Finalizadas");
        
    }
}

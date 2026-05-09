import java.util.Scanner;
import java.util.ArrayList;

public class MainArrayList_S02L05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> produtos = new ArrayList<>();

        produtos.add("refrigerante");
        produtos.add("chocolate");
        produtos.add("fruta");
        produtos.add("bolacha");

        System.out.println("Digite o que deseja encontrar: ");
        String item = sc.nextLine();

        boolean disponivel = produtos.contains(item);
        int posicao = produtos.indexOf(item);
        if(disponivel == true){
            System.out.println("O item está disponível! Posição -> " + posicao);
        }else{
            System.out.println("O item não está disponível!");
        }
        
    }
}

import java.util.ArrayList;
import java.util.List;

public class MainArray_S02L09 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        nomes.add("Estudo");
        nomes.add(" em Java");

        nomes2.add(" Estrutura de Dados");
        nomes2.add(" e Algoritmo");

        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.print(nome);
        }

        System.out.println("\n-----------------");

        for(int i = 0; i< nomes.size(); i++){
            System.out.print(nomes.get(i));
        }
    }
}

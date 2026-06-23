import java.util.LinkedList;
import java.util.Queue;

public class MainFila_S02L02 {
    public static void main(String[] args) {
        Queue <String> lista = new LinkedList<>(); 
        lista.add("João");
        lista.add("Maria");
        lista.add("Marcos");
        lista.add("Túlio");
        System.out.println(lista); 

        while (!lista.isEmpty()) { 
            System.out.println(lista.poll()); //Printa e remove os itens da lista
        }

        System.out.println(lista); //printa a lista vazia após a remoção
    }
}

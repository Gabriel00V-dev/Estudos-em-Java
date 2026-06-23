import java.util.LinkedList;
import java.util.Queue;

public class MainFila_S02L01{
    public static void main(String[] args) {
        Queue <String> carros = new LinkedList<>();

        carros.add("HRV");
        carros.add("Golf"); //  Quinto  |  Quart | Terc |Segund| Primeiro
        carros.add("Polo"); // Tiggo 3X | Camaro | Polo | Golf | HRV
        carros.add("Camaro");
        carros.add("Tiggo 3X");

        System.out.println("Topo da fila " + carros.peek()); //verificar topo da fila (HRV)
        //System.out.println("Topo da fila: " + carros.poll());// remover elemento da fila
        System.out.println(carros); //printa a fila
        System.out.println(carros.size()); //Tamanho da fila
        System.out.println(carros.isEmpty()); //Verifica se a fila esta vazia e retorna um boolean
    }
}
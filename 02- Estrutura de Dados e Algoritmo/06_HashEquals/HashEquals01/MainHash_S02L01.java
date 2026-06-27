import java.util.HashMap;

public class MainHash_S02L01 {
    public static void main(String[] args) {
        //       chave   valor
        HashMap<Integer, String> carros = new HashMap<>();

        carros.put(1, "Polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustamg");
        carros.put(6, "Cruze");

        System.out.println(carros.get(4));

        // Se i iniciar em 0, o primeiro valor retorna null, pois não temos uma chave 0
        for(int i = 1; i <= carros.size(); i++){
            System.out.println(carros.get(i));
        }

        //Remove o valor presente na chave 5s
        carros.remove(5);

        //Remove todos os elementos
        //carros.clear(); 

        System.out.println("-------------");
        //Tipo string pois queremos que retorne atring. Values retorna uma coleção de string poic definimos isso na criação do Hash
        for (String string : carros.values()) {
            System.out.println(string);
        }
    }
}

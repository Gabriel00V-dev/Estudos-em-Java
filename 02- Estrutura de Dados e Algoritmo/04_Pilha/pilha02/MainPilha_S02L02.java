import java.util.Stack;;

public class MainPilha_S02L02 {
    public static void main(String[] args) {
        Stack <String> nomes = new Stack<>();

        nomes.push("João");
        nomes.push("Pedro");
        nomes.push("Carla");
        nomes.push("Maria");

        System.out.println(nomes);

        int tam = nomes.size();

        for(int i = 0; i < tam; i++){
            if(nomes.size()-1 != 0){
                nomes.pop();
                System.out.println(nomes);
            }else{
                break;
            }
            
        }
    }
}

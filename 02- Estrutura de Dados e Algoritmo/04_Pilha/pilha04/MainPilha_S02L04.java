import java.util.Stack;
import java.util.Scanner;

public class MainPilha_S02L04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> pilha = new Stack<>();
        Stack <Character> pilhaInversa = new Stack<>();
        
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        char[] character = palavra.toCharArray();

        for(int i = 0; i<palavra.length(); i++){
            pilha.push(character[i]);
        }

        for(int i = palavra.length() -1; i >= 0; i--){
            pilhaInversa.push(character[i]);
        }
        System.out.println(pilha);
        System.out.println(pilhaInversa);

        if(!pilha.equals(pilhaInversa)){
            System.out.println("Não é palíndromo");
        }else{
            System.out.println("A palavra " + palavra + " é um palíndromo");
        }

    }
}

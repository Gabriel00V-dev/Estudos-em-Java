import java.util.Stack;
import java.util.Scanner;

public class MainPilha_S02L03 {
    public static void main(String[] args) {
        Stack <Character> pilha = new Stack<>();
        Stack <Character> pilhaInversa = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        for(int i = 0; i < palavra.length(); i++){
            char[] caracter = palavra.toCharArray();
            pilha.push(caracter[i]);
        }
        System.out.println(pilha);

        for(int i = palavra.length()-1; i >=0; i--){
            char[] caracter = palavra.toCharArray();
            pilhaInversa.push(caracter[i]);
        }
        System.out.println(pilhaInversa);

    }
}

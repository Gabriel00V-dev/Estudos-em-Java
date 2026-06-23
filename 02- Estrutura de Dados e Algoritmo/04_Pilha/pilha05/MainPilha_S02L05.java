import java.util.Stack;
import java.util.Scanner;

public class MainPilha_S02L05 {
    public static void main(String[] args) {
        Stack <Character> pilha = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma sequencia ()"); //recebe a sequencia de ()
        String seq = sc.nextLine();

        boolean valido = false;
        for(char c: seq.toCharArray()){ //percorre o input
            if(c == '('){ //se for "(" ele adiciona na pilha
                pilha.push(c);
            }else if(c == ')'){ //se for ")" ele verifica se a pilha está vazia
                if(pilha.isEmpty()){
                    valido = false;
                    break;
                }
            pilha.pop(); //se a pilha não estiver vazia ele dá pop no "(" que foi adicionado antes
            valido = true;
            }

        }

        if(pilha.isEmpty() && valido == true){ 
            System.out.println("Balanceado");
        }else{
            System.out.println("Desbalanceado");
        }
    }
}

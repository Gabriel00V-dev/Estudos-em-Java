import java.util.Stack;

public class MainPilha_S02L01 {
    public static void main(String[] args) {
        Stack <String> carros = new Stack<>();

        carros.push("HRV"); //Primeiro a entrar na pilha      | Tiggo |
        carros.push("Golf"); //Segundo a entrar na pilha      | Camaro|
        carros.push("Polo"); //Terceiro a entrar na pilha     |  Polo |
        carros.push("Camaro"); //Quarto a entrar na pilha     |  Golf |
        carros.push("Tiggo 3x"); //Quinto a entrar na pilha   |  HRV  |

        System.out.println(carros);
        System.out.println("Topo da pilha " + carros.peek()); //.peek retorna o elemento no topo da pilha
        System.out.println("A pilha está vazia? " + carros.empty()); // .empty retorna um boolean após verificar se a pilha esta vazia ou não
        System.out.println("Remover elemento do topo: " + carros.pop()); //.pop remove o elemento no topo da pilha
        
        //carros.clear(); esvaziar a pilha
    }
}

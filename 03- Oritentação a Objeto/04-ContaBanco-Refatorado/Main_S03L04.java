import java.util.Scanner;

public class Main_S03L04{
    public static void main(String[] args) {
        ContaBanco_S03L04 p1 = new ContaBanco_S03L04();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        ContaBanco_S03L04 p2 = new ContaBanco_S03L04();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
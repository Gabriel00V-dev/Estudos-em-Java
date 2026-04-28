import java.util.Scanner;
import java.util.ArrayList;

public class MainArrayList_S02L02{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> idades = new ArrayList<>();

    char x = 'n';

    do{
        System.out.println("--MENU--");
        System.out.println("1) Adicionar Numeros");
        System.out.println("2) Listar Numeros");
        System.out.println("3) Sair");
        int result = sc.nextInt();

        switch (result) {
            case 1:
                System.out.println("Digite um numero: ");
                idades.add(sc.nextInt());
                break;

            case 2:
                System.out.println(idades);
                break;
        
            case 3:
                System.out.println("Voce deseja finalizar o programa? [s] [n]");
                x = sc.next().charAt(0);
                if(x == 's'){
                    System.out.println("Programa Finalizado!");
                }
                break;
            
                default:
                System.out.println("Digite um numero valido!");
                break;
        }
    }while(x != 's');
    
    }
}

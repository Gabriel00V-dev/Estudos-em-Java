import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número qualquer");
        int n2 = sc.nextInt();

        System.out.println("Agora defina um operador [1]Soma [2]Subtraçao [3]Multiplicaçao [4]Divisao");
        int operador = sc.nextInt();

        switch (operador) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;

            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            
                case 4:
                if(n2 == 0){
                    System.out.println("Impossivel dividir por 0");
                }else{
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Numero Inválido");
                break;
        }
    }
}
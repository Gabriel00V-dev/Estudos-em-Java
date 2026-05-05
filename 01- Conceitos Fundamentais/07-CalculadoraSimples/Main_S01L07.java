import java.util.Scanner;

public class Main_S01L07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        float n1 = sc.nextInt();

        System.out.println("Digite outro número qualquer");
        float n2 = sc.nextInt();

        float resultado;

        System.out.println("Agora defina um operador [1]Soma [2]Subtraçao [3]Multiplicaçao [4]Divisao");
        int operador = sc.nextInt();

        switch (operador) {
            case 1:
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;
            
            case 2:
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println(n1 + " x " + n2 + " = " + resultado);
                break;
            
                case 4:
                if(n2 == 0){
                    System.out.println("Impossivel dividir por 0");
                }else{
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Numero Inválido");
                break;
        }
    }
}
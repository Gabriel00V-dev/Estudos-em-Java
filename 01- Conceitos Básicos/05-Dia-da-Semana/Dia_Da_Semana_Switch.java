import java.util.Scanner;

public class Dia_Da_Semana_Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
    
        do{
            System.out.println("Digite um número de 1 a 7: ");
            dia = sc.nextInt();
            switch (dia) {
            case 1:
                System.out.println("[1] Corresponde a Segunda Feira");
                break;
            case 2:
                System.out.println("[2] Corresponde a Terça Feita");
                break;
            case 3:
                System.out.println("[3] Corresponde a Quarta Feira");
                break;
            case 4:
                System.out.println("[4] Corresponde a Quinta Feira");
                break;
            case 5:
                System.out.println("[5] Corresponde a Sexta Feria");
                break;
            case 6:
                System.out.println("[6] Corresponde a Sábado");
                break;
            case 7:
                System.out.println("[7] Corresponde a Domingo");
                break;
        
            default:
                System.out.println("Digite um numero válido de 1 a 7. \nSe quiser sair pressione 9");
                break;
        }
        }while(dia != 9);
        
    }
}
import java.util.Scanner;

public class Numeros_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer: ");
        int numero = sc.nextInt();

        if(numero < 2){
            System.out.println("Nao é um numero primo");
        }
        boolean primo = true;
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println(numero + " é primo");
        }else{
            System.out.println(numero + " nao é primo");
        }
    }
}

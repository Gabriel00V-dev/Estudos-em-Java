import java.util.Scanner;

public class Contador_Par_Impar_ForIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lista[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            lista[i] = sc.nextInt();
            
        }
        for(int i = 0; i < 10; i++){
            if(lista[i] % 2 == 0){
                System.out.println(lista[i] + " é par");
            }else{
                System.out.println(lista[i] + " é ímpar");
            }
        }
    }
}
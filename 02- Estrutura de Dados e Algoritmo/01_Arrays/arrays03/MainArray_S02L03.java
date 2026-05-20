import java.util.Scanner;

public class MainArray_S02L03{
    public static void main(String[] args) {
        int soma = 0;
        int[] notas = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i  = 0; i < notas.length; i++){
                System.out.println("Digite sua nota: ");
                notas[i] = sc.nextInt();
                soma = soma + notas[i];
            }
        }
        System.out.println("A média das notas é: " + soma / notas.length);
    }
}
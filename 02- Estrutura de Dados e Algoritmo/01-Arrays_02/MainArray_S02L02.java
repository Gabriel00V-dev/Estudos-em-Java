import java.util.Scanner;

public class MainArray_S02L02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        
        for(int i = 0; i< lista.length; i++){
            System.out.println("Digite um número para a lista: ");
            lista[i] = sc.nextInt();
        }

        int maior = lista[0];
        int menor = lista[0];

        for(int i = 1; i < lista.length; i++){
            if(lista[i] > maior){
                maior = lista[i];
            }
            if(lista[i] < menor){
                menor = lista[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        
    }
}
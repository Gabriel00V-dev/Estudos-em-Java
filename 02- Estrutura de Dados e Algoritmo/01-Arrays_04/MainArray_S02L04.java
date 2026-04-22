import java.util.Scanner;

public class MainArray_S02L04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];

        for(int i = 0; i < lista.length; i++){
            System.out.println("Digite um numero inteiro: ");
            lista[i] = sc.nextInt();
        }
        
        for(int i = 0; i < lista.length; i++){ //Aplicando e entendendo BubbleSort
            for(int j = 0; j < (lista.length - 1); j++){
                if(lista[j] > lista[j+1]){
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }

        System.out.println("Lista ordendada: ");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i] + " ");
        }
    }
}
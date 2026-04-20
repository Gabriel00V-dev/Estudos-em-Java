import java.util.Scanner;

public class Classificador_De_Notas_ForIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite "+ i+1 +" numero(s) inteiro(s) de 0 a 10");
            int nota = sc.nextInt();
            notas = notas + nota;
        }
        float media = notas / 5;  
        
        if(media < 5){
            System.out.println("Classificação D - Média: " + media);
        }else if(media >= 5 &&  media < 7){
            System.out.println("Classificação C - Média: " + media);
        }else if(media >= 7 && media < 9){
            System.out.println("Classificação B - Média: " + media);
        }else if(media >= 9){
            System.out.println("Classificação A - Média: " + media);
        }
    }
}

import java.util.Scanner;

public class Main_S01L03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Voce é menor de idade");
        }else if(idade == 18){
            System.out.println("Voce tem exatamente 18 anos");
        }else{
            System.out.println("Voce é maior de idade");
        }
    }
}
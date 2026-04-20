import java.util.Scanner;

public class Verificador_De_Idade_IfElse{
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
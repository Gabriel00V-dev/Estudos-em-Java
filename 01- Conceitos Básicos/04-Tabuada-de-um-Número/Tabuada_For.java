import java.util.Scanner;

public class Tabuada_For{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num*i);

        }
    }
}
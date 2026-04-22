import java.util.Random;
import java.util.Scanner;

public class Main_S01L11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(100) + 1;
        boolean acertou = false;

        do{
            System.out.println("###############################");
            System.out.println("Tente acertar o numero secreto (de 1 a 100): ");
            int n1 = sc.nextInt();
            if(n1 != num){
                if(n1>num){
                    System.out.println("O numero secreto é menor");
                }else{
                    System.out.println("O numero secreto é maior");
                }
            }else{
                System.out.println("Acertou!!");
                acertou = true;
            }
        }while(acertou != true);

    }
}
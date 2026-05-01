import java.util.Scanner;
import java.util.ArrayList;

public class MainArrayList_S02L03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Lista1 = new ArrayList<>();
        ArrayList<Integer> Lista2 = new ArrayList<>();
        ArrayList<Integer> Result = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Digite um numero para o primeiro array " + (i+1));
            Lista1.add(sc.nextInt());
        }

        for(int i = 0; i<5; i++){
            System.out.println("Digite um numero para o segundo array " + (i+1));
            Lista2.add(sc.nextInt());
        }

        for(int i = 0; i<5; i++){
            Result.add(Lista1.get(i) + Lista2.get(i));
        }

        System.out.println(Result);
    }
}



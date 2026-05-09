import java.util.Scanner;
import java.util.ArrayList;

public class MainArrayList_S02L07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> n1 = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            System.out.println("Digite um numero");
            n1.add(sc.nextInt());
        }

        for(int i = 0; i < n1.size()-1; i++){
            int min = i;

            for(int j = i+1; j < n1.size(); j++){
                if(n1.get(j) < n1.get(min)){
                    min = j;
                }
            }
            int temp = n1.get(min);
            n1.set(min, n1.get(i));
            n1.set(i, temp);
        }
        System.out.println("Ordenado: " + n1);
    }
}

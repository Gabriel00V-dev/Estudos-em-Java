import java.util.ArrayList;
import java.util.Random;

public class MainArrayList_S02L01{
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int min = 10000;
        int max = 99999;

        for(int i = 0; i<20; i++){
            int n1 = random.nextInt((max - min) + 1) + min;
            numeros.add(n1);
        }
            System.out.println(numeros);
    }
}
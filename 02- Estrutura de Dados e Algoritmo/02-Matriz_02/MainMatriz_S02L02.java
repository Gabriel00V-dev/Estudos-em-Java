import java.util.Scanner;

public class MainMatriz_S02L02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Preencha a Matriz 1 Linha-> " + i + " Coluna-> " + j);
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Preencha a Matriz 2 Linha-> " + i + " Coluna-> " + j);
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] m3 = new int[3][3];

        System.out.println("\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m3[i][j] = m1[i][j] * m2[i][j];
                System.out.printf(" " + m3[i][j]);
            }
            System.out.println("\n");
        }
    }
}

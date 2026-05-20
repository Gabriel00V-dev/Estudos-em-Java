import java.util.Scanner;

public class MainMatriz_S02L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha = 3;
        int coluna = 3;
        int[][] m1 = new int[linha][coluna];
        int[][] m2 = new int[linha][coluna];

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.println("Digite o valor para a matriz");
                m1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf(" " + m1[i][j]);
            }
            System.out.println("\n");
        }

        for(int i = 0; i < linha; i++){
            for(int j = 0; j< coluna; j++){
                m2[j][i] = m1[i][j];
            }
        }

        System.out.println("\n");
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf(" " + m2[i][j]);
            }
            System.out.println("\n");
        }

    }
}

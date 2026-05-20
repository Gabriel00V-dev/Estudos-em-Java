import java.util.Scanner;

public class MainMatriz_S02L04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] m3 = new int[2][2];

        for(int i = 0; i<2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite os valores da Matriz 1");
                m1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Digite os valores da Matriz 2");
                m2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                for(int k = 0; k<2; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        for(int i = 0; i<2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf(" " + m3[i][j]);
            }
            System.out.println("\n");
        }
        
    }
}

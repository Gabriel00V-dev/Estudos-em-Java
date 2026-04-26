import java.security.SecureRandom; 

public class MainMatriz_S02L01{
    public static void main(String[] args) {
        int linha = 3;
        int coluna = 5;
        int[][] numeros = new int[linha][coluna]; //Matriz

        for(int l=0; l<linha; l++){
            for(int c = 0; c <coluna; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for(int l=0; l<linha; l++){
            for(int c = 0; c <coluna; c++){
                System.out.printf(" " + numeros[l][c]);
            }
            System.out.println();
        }
        
    }
}
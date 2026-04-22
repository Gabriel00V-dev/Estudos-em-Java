public class MainArray_S02L01{
    public static void main(String[] args) {
        int[] num = new int[5]; //declaração e tamanho do array (inicia em 0 até 4)
        num[0] = 20; //atribuição de valor a uma posição específica
        num[1] = 25;
        num[2] = 30;
        num[3] = 35;
        num[4] = 40;

        for(int i = 0; i < num.length;i++){ //imprimir elementos do array
            System.out.println(num[i]);
        }

        System.out.println("\n");

        for(int i = num.length-1; i >= 0; i--){ //imprimir elementos do array de trás para frente
            System.out.println(num[i]);
        }

        int[] num2 = {10, 15, 20, 25, 30}; //declara um array já com valores pré estabelecidos
    }
}
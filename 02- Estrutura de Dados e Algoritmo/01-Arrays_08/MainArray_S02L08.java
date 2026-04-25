public class MainArray_S02L08{
    public static void main(String[] args) {
         int[] array = {1, 5, 8, 10, 21,15, 20};

         int numeroprocurado = 8;

         int posicao = buscaBinaria(array, numeroprocurado);

         System.out.println("O numero esta na posição: " + posicao);

    }

    private static int buscaBinaria(int[] array, int num){

        int inicio = 0;
        int fim = array.length-1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;

            if(array[meio] == num){
                return meio;
            }else if(array[meio] > num){
                inicio = meio+1;
            }else{
                fim = meio-1;
            }
        }

        return -1;

    }
}
public class MainExcecao_S04L04 {
    public static void main(String[] args) {
        divisao(1, 0); //ArithmeticException: / by zero

        System.out.println("Código Finalizado"); //Nunca vai ser printado
    }
    public static int divisao (int a, int b){ //Exemplos de uso de exceções
       if(b == 0){
        throw new IllegalArgumentException("Argumento ilegal, não pode ser 0"); 
       }
       return a/b;
       
        /*try{
            return a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;*/
    }

}

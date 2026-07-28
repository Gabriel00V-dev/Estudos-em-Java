public class MainExcecao_S04L01 {
    public static void main(String[] args) {
        recursividade(); //StackOverflow Error
    }

    public static void recursividade(){ //Estourando a memória com recursividade
        recursividade(); 
    }
}

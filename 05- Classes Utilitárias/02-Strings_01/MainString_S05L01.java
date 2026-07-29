public class MainString_S05L01 {
    public static void main(String[] args) { //String são imutáveis!!!
        String nome = "William"; //String constant pool
        String nome2 = "William";
        nome = nome.concat(" Silva");
        System.out.println(nome); 
        String nome3 = new String("Willian"); // Quando faz isso voce está criando: 1- variavel de referencia, 2- objeto do tipo string, 3- uma string no pool de string
    }
}

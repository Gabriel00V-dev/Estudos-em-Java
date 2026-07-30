public class MainStrings_S05L04 {
    public static void main(String[] args) {
        String nome = "João Carlos";
        nome.concat(" Silva");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("João Carlos");
        sb.append(" Silva").append(" Pereira"); //Concatenando
        sb.reverse(); //Inverte 
        sb.reverse(); //Inverte o Inverso anterior
        sb.delete(0, 3); //Excluir caracteres da posição 0 até a posição 3
        System.out.println(sb);
    }
}

public class MainString_S05L02{
    public static void main(String[] args) {
        String nome = "Joãoooo";
        String numeros = "012345";

        System.out.println(nome.charAt(0)); //Retorna um char baseado no índice
        System.out.println(nome.length()); //Retorna o tamanho da string
        System.out.println(nome.replace("J","P")); //Trocar todos os caracteres de J por P
        System.out.println(nome.toLowerCase()); //Transformar tudo em minúsculo
        System.out.println(nome.toUpperCase()); // Transformar tudo em maiúsculo;
        System.out.println(nome.substring(0, 4)); //Extrai uma parte de uma string e retorna uma nova mantendo a original imutável
        System.out.println(nome.substring(2, numeros.length())); //Defino o início e fim da cadeia de substring (o fim é sempre -1 do que o definido)
        System.out.println(nome.trim()); //remove valores em branco do começo e no fim da string
    }
}
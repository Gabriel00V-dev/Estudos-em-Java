import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainRegex_S05L01 {
    public static void main(String[] args) {
        /*
        META CARACTERES
        \d = Todos os dígitos
        \D = Tudo o que não for dígito
        \s = Espaços em branco
        \S = Todos os caracteres excluindo os brancos
        \w = a-zA - Z, dígitos, _
        \W = Tudo que não for incluso no \w

        RANGE
        [a-z] = Todas as letras minúsculas de 'a' a 'z'

        QUANTIFICADORES
        ? = Zero ou uma
        * = Zero ou mais
        + = Uma ou mais
        {n,m} = de n até m
        () = agrupamento
        | = Ou
        $ = Fim da linha
        . = 1.3 = 123, 133, 1@3, 1A3
         */
        
        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(texto); 
        System.out.println("texto:   " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+ " " + matcher.group() + " ");
        }
    }
}

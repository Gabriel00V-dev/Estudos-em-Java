import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex_S05L03 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "joao@hotmail.com, 123pedrinho@gmail.com, #$!caio@mail.br, perddy@gmail.com, maria@mail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group()+"\n");
        }
    }
}

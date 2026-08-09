import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainRegex_S05L02 {
    public static void main(String[] args) {

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(texto); 
        System.out.println("texto:   " +texto);
        System.out.println("regex "+regex);
        while (matcher.find()) {
            System.out.printf("\n"+matcher.start()+ " " + matcher.group() + " ");
        }
    }
}

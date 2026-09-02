import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class MainStream_S06L04 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream()
                .map(w -> w.split("")) //Stream<String[]>
                .flatMap(Arrays::stream) //Stream<String>
                .collect(Collectors.toList());
        System.out.println(letters2);
    }   
}

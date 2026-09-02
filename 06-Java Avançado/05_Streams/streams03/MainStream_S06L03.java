import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainStream_S06L03 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = Arrays.asList("Carlos", "joão", "Fabrício");
        List<String> developers = Arrays.asList("David", "Patrick", "Jéca");
        List<String> students = Arrays.asList("Gustavo", "Olimpio", "Jacó");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        for(List<String> people : devdojo){
            for(String person : people){
                System.out.println(person);
            }
        }

        System.out.println("--------");
        devdojo.stream()
            .flatMap(Collection::stream)
            .forEach(System.out::println);
    }
}

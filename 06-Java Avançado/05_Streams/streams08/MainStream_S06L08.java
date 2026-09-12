import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream_S06L08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.println(n + " "));
        System.out.println();

        IntStream.range(1, 50)
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.println(n + " "));
        System.out.println();

        Stream.of("Eleve ", "O ", "Cosmo ", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s + " "));
        
        int num[] = {1, 2, 3, 4, 5};
         Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("shared/file.txt"))) {
            lines.forEach(System.out::println);
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("-----");
        
    }
}

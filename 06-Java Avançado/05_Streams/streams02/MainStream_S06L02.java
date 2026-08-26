import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainStream_S06L02 {
    private static List<LightNovel> lightNovels = Arrays.asList(
        new LightNovel("Tensei Shittara", 8.99),
        new LightNovel("Overlord", 3.99),
        new LightNovel("Violet Evergarden", 5.99),
        new LightNovel("No Game no Life", 2.99),
        new LightNovel("Fullmetal Alchemist", 5.99),
        new LightNovel("Kumo desuga", 1.99),
        new LightNovel("Monogatari", 4.00)
    );
    public static void main(String[] args) {
        //lightNovels.stream().forEach(System.out::println); -> Forma errada
        //lightNovels.forEach(System.out::println); -> Forma correta

        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}

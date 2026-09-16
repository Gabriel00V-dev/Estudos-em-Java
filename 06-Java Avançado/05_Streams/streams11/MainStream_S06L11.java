import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStream_S06L11 {
private static List<LightNovel> lightNovels = Arrays.asList(
        new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
        new LightNovel("Overlord", 3.99, Category.FANTASY),
        new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
        new LightNovel("No Game no Life", 2.99, Category.FANTASY),
        new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
        new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
        new LightNovel("Monogatari", 4.00, Category.DRAMA)
    );
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}

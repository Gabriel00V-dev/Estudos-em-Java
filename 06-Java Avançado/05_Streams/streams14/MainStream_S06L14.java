import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStream_S06L14 {
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
    Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
    System.out.println(collect);

    Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(MainStream_S06L14::getPromotion, Collectors.toSet())));
    System.out.println(collect1);
    
    Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(MainStream_S06L14::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
    System.out.println(collect2);

    }
    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MainLamb_S06L05 {
    public static void main(String[] args) {
        Supplier<AnimeComparatorLamb_S06L05> newAnimeComparators = AnimeComparatorLamb_S06L05::new;

        AnimeComparatorLamb_S06L05 animeComparators = newAnimeComparators.get();

        List<AnimeLamb_S06L05> animeList= Arrays.asList(
            new AnimeLamb_S06L05("Berserk", 42), 
            new AnimeLamb_S06L05("One Piece", 900), 
            new AnimeLamb_S06L05("Naruto", 500)
        );

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, AnimeLamb_S06L05> animeBiFunction = (title, episodes) -> new AnimeLamb_S06L05(title, episodes);
        BiFunction<String, Integer, AnimeLamb_S06L05> animeBiFunction2 = AnimeLamb_S06L05::new;
        System.out.println(animeBiFunction2.apply("Super 11", 60));
    }

}

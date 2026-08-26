import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MainLamb_S06L04 {
    public static void main(String[] args) {
        List<AnimeLamb_S06L04> animeList= Arrays.asList(
            new AnimeLamb_S06L04("Berserk", 42),
            new AnimeLamb_S06L04("One Piece", 900),
            new AnimeLamb_S06L04("Naruto", 500)
        );

        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle())); //Lambda
        
        
        /*
        Collections.sort(animeList, AnimeComparatorLamb_S06L04::compareByTitle); ->Method Reference
        Collections.sort(animeList, AnimeComparatorLamb_S06L04::compareByEpisodes); ->Referencia a metodos estáticos
        */
        
        /* 
        AnimeComparatorLamb_S06L04 animeComparator = new AnimeComparatorLamb_S06L04();
        animeList.sort(animeComparator::compareByEpisodesNonStatic); //Referencia a metodos não estáticos
        */
        
        List<String> list = Arrays.asList("Pedro", "Leonardo", "José");
        list.sort(String::compareTo);
        System.out.println(list);
        
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Pedro"));

    }
}

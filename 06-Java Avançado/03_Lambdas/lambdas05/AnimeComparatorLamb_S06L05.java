public class AnimeComparatorLamb_S06L05 {
    public static int compareByTitle(AnimeLamb_S06L05 a1, AnimeLamb_S06L05 a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(AnimeLamb_S06L05 a1, AnimeLamb_S06L05 a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(AnimeLamb_S06L05 a1, AnimeLamb_S06L05 a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

}

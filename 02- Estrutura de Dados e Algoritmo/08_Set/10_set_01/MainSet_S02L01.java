import java.util.HashSet;
import java.util.Set;

public class MainSet_S02L01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //Set<Manga> mangas2 = new LinkedHashSet<>(); Manter ordem de inserção
        mangas.add(new Manga(1L, "Naruto", 19.9, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 90.1, 5));
        mangas.add(new Manga(3L, "Boku no Hero", 50.5, 0));
        mangas.add(new Manga(2L, "One Piece", 6.7, 2));
        mangas.add(new Manga(5L, "Attack on Titan", 15.5, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}

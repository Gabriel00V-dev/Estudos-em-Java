import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator_S02L01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "Naruto", 19.9, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 90.1, 5));
        mangas.add(new Manga(3L, "Boku no Hero", 50.5, 0));
        mangas.add(new Manga(2L, "One Piece", 6.7, 2));
        mangas.add(new Manga(5L, "Attack on Titan", 15.5, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
    }
}

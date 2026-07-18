import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}

public class MainSorting_S02L02 {

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 90.1));
        mangas.add(new Manga(3L, "Boku no Hero", 50.5));
        mangas.add(new Manga(2L, "One Piece", 6.7));
        
       Collections.sort(mangas);
       System.out.println("---------");
       for(Manga manga : mangas){
        System.out.println(manga);
       }

       //Collections.sort(mangas, new MangaByIdComparator());
       mangas.sort(new MangaByIdComparator());
       System.out.println("---------");
       for(Manga manga: mangas){
        System.out.println(manga);
       }

    }
}

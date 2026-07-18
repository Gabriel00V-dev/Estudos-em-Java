import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSorting_S02L01 {
    public static void main(String[] args) {
        List<String> manga = new ArrayList<>();
        manga.add("Naruto");
        manga.add("Dragon Ball Z");
        manga.add("Boku no Hero");
        manga.add("One Piece");

        Collections.sort(manga);
        for(String mangas : manga){
            System.out.println(mangas);
        }

        List<Double> dinheiro = new ArrayList<>();
        dinheiro.add(120.50);
        dinheiro.add(280.50);
        dinheiro.add(20.60);
        dinheiro.add(10.10);

        Collections.sort(dinheiro);
        for(Double grana : dinheiro){
            System.out.println(grana);
        }

    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream_S06L01 {
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
        List<String> titles = lightNovels.stream()
            .sorted(Comparator.comparing(LightNovel::getTitle)) //Primeiro ordena
            .filter(ln -> ln.getPrice() <= 4) //Depois filtra por preço
            .limit(3) //Depois limita a 3 LightNovels
            .map(LightNovel::getTitle) //Pega somente o título
            .collect(Collectors.toList()); //Coleta o restante e agrupa numa lista de Títulos
        System.out.println(titles);

        /* Mesma operação, sem usar Streams
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();    
        for(LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);*/
    
    }
}

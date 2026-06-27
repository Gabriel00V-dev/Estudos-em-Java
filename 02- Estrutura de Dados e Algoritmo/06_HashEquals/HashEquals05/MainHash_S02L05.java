import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MainHash_S02L05 {
    public static void main(String[] args) {
        ConsumidorHash_S02L05 consumidor1 = new ConsumidorHash_S02L05("João");
        ConsumidorHash_S02L05 consumidor2 = new ConsumidorHash_S02L05("Marcelo");
        MangaHash_S02L05 manga1 = new MangaHash_S02L05(1L, "Naruto", 19.9);
        MangaHash_S02L05 manga2 = new MangaHash_S02L05(4L, "Dragon Ball Z", 90.1);
        MangaHash_S02L05 manga3 = new MangaHash_S02L05(3L, "Boku no Hero", 50.5);
        MangaHash_S02L05 manga4 = new MangaHash_S02L05(2L, "One Piece", 6.7);

        List<MangaHash_S02L05> mangaConsumidor1List = new ArrayList<>();
        mangaConsumidor1List.add(manga1);
        mangaConsumidor1List.add(manga2);
        mangaConsumidor1List.add(manga3);
        
        List<MangaHash_S02L05> mangaConsumidor2List = new ArrayList<>();
        mangaConsumidor2List.add(manga3);
        mangaConsumidor2List.add(manga4);
        Map<ConsumidorHash_S02L05, List <MangaHash_S02L05>> consumidorMangaMap = new HashMap<>();
        
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for(Map.Entry<ConsumidorHash_S02L05, List <MangaHash_S02L05>> entry : consumidorMangaMap.entrySet()){
            System.out.println("--"+entry.getKey().getNome());
            for(MangaHash_S02L05 manga : entry.getValue()){
                System.out.println("--"+manga.getNome());
            }
        }

    }
}

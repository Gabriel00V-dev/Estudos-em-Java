import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainLamb_S06L02 {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("João", "Caio", "Igor", "Lucas");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        forEach(string, s -> System.out.println(s));
        forEach(integers, (Integer i) -> System.out.println(i));
        //  O tipo pode ou não ser especificado, pois o compilador já sabe qual o tipo.
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e : list){
            consumer.accept(e);
        }
    }
}

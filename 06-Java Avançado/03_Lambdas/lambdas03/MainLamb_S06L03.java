import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*As 3 melhores interfaces para programação funcional
- Predicate
- Consumer
- Function 
*/

public class MainLamb_S06L03 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Yago", "Bruno");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> map = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
    }

    //T é o que ele vai receber e R o que ele vai retornar
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e); //recebe T retorna R
            result.add(r);
        }
        return result;
    }

}

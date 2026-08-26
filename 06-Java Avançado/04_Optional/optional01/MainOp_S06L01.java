import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MainOp_S06L01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("hello");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-----------------");

        Optional<String> nameOptional = findName("Carlos");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name){

        List<String> list = Arrays.asList("Jéca", "Carlos");
        int i = list.indexOf(name);
        if(i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}

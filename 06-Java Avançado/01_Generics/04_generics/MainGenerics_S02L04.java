import java.util.Arrays;
import java.util.List;
public class MainGenerics_S02L04 {
    public static void main(String[] args) {
        List<BarcoGenerics_S02L03> barcoList = criarArrayComUmObjeto(new BarcoGenerics_S02L03("Canoa"));      
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = Arrays.asList(t);
        return Arrays.asList(t);
    }

    // private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
    //     List<T> list = Arrays.asList(t);
    //     return Arrays.asList(t);
    // }

}

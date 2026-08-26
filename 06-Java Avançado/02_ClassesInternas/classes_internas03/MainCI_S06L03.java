import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MainCI_S06L03 {
    public static void main(String[] args) {
       List<BarcoGenerics_S02L03> barcoList = Arrays.asList(new BarcoGenerics_S02L03("Lancha"), new BarcoGenerics_S02L03("Canoa"));
       barcoList.sort(new Comparator<BarcoGenerics_S02L03>(){ //Classe Anônima
        @Override
        public int compare(BarcoGenerics_S02L03 o1, BarcoGenerics_S02L03 o2) {
            return o1.getNome().compareTo(o2.getNome());
            }
       });
       System.out.println(barcoList);
    }
}

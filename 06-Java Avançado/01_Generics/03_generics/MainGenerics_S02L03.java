import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenerics_S02L03 {
    public static void main(String[] args) {

        List<CarrosGenerics_S02L03> carrosDisponiveis = new ArrayList<>(Arrays.asList(new CarrosGenerics_S02L03("BMW"), new CarrosGenerics_S02L03("Fusca")));
        List<BarcoGenerics_S02L03> barcosDisponiveis = new ArrayList<>(Arrays.asList(new BarcoGenerics_S02L03("Lancha"), new BarcoGenerics_S02L03("Veleiro")));

        RentalService<CarrosGenerics_S02L03> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        CarrosGenerics_S02L03 carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("--------------");

        RentalService<BarcoGenerics_S02L03> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        BarcoGenerics_S02L03 barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
      
    }
}

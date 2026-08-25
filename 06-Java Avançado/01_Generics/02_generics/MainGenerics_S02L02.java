import java.util.List;
import java.util.Arrays;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando doguinhos");
    }

}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }

}

public class MainGenerics_S02L02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = Arrays.asList(new Cachorro(), new Cachorro());
        List<Gato> gatos = Arrays.asList(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    //Não pode adicionar elementos na lista "?"
    private static void printConsulta(List<? extends Animal> animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }

    //Para adicionar elementos
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}

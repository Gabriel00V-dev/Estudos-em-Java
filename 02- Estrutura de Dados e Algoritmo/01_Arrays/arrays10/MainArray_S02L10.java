import java.util.ArrayList;
import java.util.List;

public class MainArray_S02L10 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "IPhone");
        Smartphone s2 = new Smartphone("22222", "Motorola");
        Smartphone s3 = new Smartphone("44444", "Samsung");

        List<Smartphone> smartphone = new ArrayList<>();
        smartphone.add(s1);
        smartphone.add(s2);
        smartphone.add(s3);

        for(Smartphone smart: smartphone){
            System.out.println(smart);
        }

        Smartphone s4 = new Smartphone("44444", "Samsung");

        System.out.println(smartphone.contains(s4));
        int indexSmartphone4 = smartphone.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphone.get(indexSmartphone4));
    }
}

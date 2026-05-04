public class Main_S03L11{
    public static void main(String[] args) {
    Cachorro_S03L11 c = new Cachorro_S03L11();
    Lobo_S03L11 l = new Lobo_S03L11();
    l.emitirSom();
    c.emitirSom();

    c.reagir("Olá");
    c.reagir(11,45);
    c.reagir(false);
    c.reagir(true);
    c.reagir(2, 12.5f);
    }
}


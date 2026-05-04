public class Main_S03L10 {
    public static void main(String[] args) {
        Mamifero_S03L10 m = new Mamifero_S03L10();
        Reptil_S03L10 r = new Reptil_S03L10();
        Peixe_S03L10 p = new Peixe_S03L10();
        Ave_S03L10 a = new Ave_S03L10();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        Canguru_S03L10 c = new Canguru_S03L10();
        c.locomover();

        p.soltarBolha(); 
    }
}

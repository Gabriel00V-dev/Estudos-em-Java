public class Mamifero_S03L10 extends Animal_S03L10 {
    private String corPelo;


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
}

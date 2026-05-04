public class Reptil_S03L10 extends Animal_S03L10{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
        
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
        
    }
}

public class Peixe_S03L10 extends Animal_S03L10{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe_S03L10 não faz som");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
}

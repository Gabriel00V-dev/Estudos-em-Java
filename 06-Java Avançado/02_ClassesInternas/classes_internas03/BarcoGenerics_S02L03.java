public class BarcoGenerics_S02L03 {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BarcoGenerics_S02L03(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "BarcoGenerics_S02L03 [nome=" + nome + "]";
    }

}

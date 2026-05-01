public class Pessoa_S03L08 {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversaio(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa_S03L08 [nome=" + this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + "]";
    }

}

import java.io.Serializable;

public class Aluno_S05L01 implements Serializable{
    private Long id;
    private String nome;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Aluno_S05L01(Long id, String nome, String password){
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno_S05L01 [id=" + id + ", nome=" + nome + ", password=" + password + "]";
    }

}
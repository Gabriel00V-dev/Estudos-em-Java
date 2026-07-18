import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno_S05L01 implements Serializable{
    private static final long serialVersionUID = 5467001766554882144L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma_S05L01 turma;

    public Turma_S05L01 getTurma() {
        return turma;
    }

    public void setTurma(Turma_S05L01 turma) {
        this.turma = turma;
    }

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
        System.out.println("Dentro do contrutor");
    }

    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma_S05L01(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno_S05L01 [id=" + this.id + ", nome=" + this.nome + ", password=" + this.password + ", turma=" + turma +"]";
    }

}
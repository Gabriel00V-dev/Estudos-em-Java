public class Aluno_S03L09 extends Pessoa_S03L09{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensaldidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
}

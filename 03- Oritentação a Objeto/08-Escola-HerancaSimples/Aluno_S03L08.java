public class Aluno_S03L08 extends Pessoa_S03L08{
    private int matr;
    private String curso;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }
}

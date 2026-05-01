public class Main_S03L08{
    public static void main(String[] args) {
    Pessoa_S03L08 p1 = new Pessoa_S03L08();
    Aluno_S03L08 p2 = new Aluno_S03L08();
    Professor_S03L08 p3 = new Professor_S03L08();
    Funcionario_S03L08 p4 = new Funcionario_S03L08();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Cláudio");
    p4.setNome("Fabiana");

    p1.setSexo("M");
    p4.setSexo("F");
    p2.setIdade(18);

    p2.setCurso("Informãtica");
    p3.setSalario(2500.75f);
    p4.setSetor("Estoque");

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());

}
}


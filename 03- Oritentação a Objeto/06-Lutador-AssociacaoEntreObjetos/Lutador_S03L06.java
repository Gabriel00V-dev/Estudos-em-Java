public class Lutador_S03L06{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int derrota, vitoria, empate;

    //metodos públicos
    public void apresentar(){
        System.out.println("Lutador_S03L06: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println( this.getIdade() + " anos");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
    }

    public void status(){
        System.out.println("\n" + this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitórias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }

    public void ganharLuta(){
        this.setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        this.setDerrota(getDerrota() + 1);
    }

    public void empatarLuta(){
        this.setEmpate(getEmpate() + 1);
    }

    public Lutador_S03L06(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {

        if(this.getPeso() < 52.2){
            this.categoria = "Invalido";
        }
        else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }

    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }

}
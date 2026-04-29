public class Livro_S03L07 implements Publicacao_S03L07 {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa_S03L07 leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa_S03L07 getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa_S03L07 leitor) {
        this.leitor = leitor;
    }

    public Livro_S03L07(String titulo, String autor, int totPaginas, Pessoa_S03L07 leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    @Override
    public String toString() {
        return "Livro_S03L07 [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", leitor=" + leitor + "]";
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}

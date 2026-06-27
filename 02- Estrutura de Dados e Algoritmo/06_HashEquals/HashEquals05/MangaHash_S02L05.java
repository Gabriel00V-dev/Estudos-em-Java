import java.util.Objects;

public class MangaHash_S02L05 implements Comparable <MangaHash_S02L05>{
    private Long id;
    private String nome;
    private double preco;

    public MangaHash_S02L05(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        MangaHash_S02L05 manga = (MangaHash_S02L05) obj;
        return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }
    @Override
    public String toString() {
        return "Manga_S02L01 [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }
    @Override
    public int compareTo(MangaHash_S02L05 outroManga) {
       //negativo se o this < outroManga
       //se this == outroManga, return 0
       //positivo se this > outroManga

    //    if(this.id < outroManga.getId()){
    //     return -1;
    //    }else if(this.id.equals(outroManga.getId())){
    //     return 0;
    //    }else{
    //     return 1;
    //    }

    return this.id.compareTo(outroManga.getId());
    }

}


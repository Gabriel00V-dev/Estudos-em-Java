public class Visualizacao_S03L12 {
    private Gafanhoto_S03L12 espectador;
    private Video_S03L12 filme;
    
    public Gafanhoto_S03L12 getEspectador() {
        return espectador;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 20;
        if(porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if (porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public void setEspectador(Gafanhoto_S03L12 espectador) {
        this.espectador = espectador;
    }

    public Video_S03L12 getFilme() {
        return filme;
    }

    public void setFilme(Video_S03L12 filme) {
        this.filme = filme;
    }

    public Visualizacao_S03L12(Gafanhoto_S03L12 espectador, Video_S03L12 filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao_S03L12 [espectador=" + espectador + ", filme=" + filme + "]";
    }

}

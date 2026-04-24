public class Vetor_S02L05 {
    private String[] elementos;

    public Vetor_S02L05(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento){
        for(int i = 0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}

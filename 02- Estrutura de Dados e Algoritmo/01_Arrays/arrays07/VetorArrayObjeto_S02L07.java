public class VetorArrayObjeto_S02L07 <T>{
    private T[] elementos;
    private int tamanho;

    public VetorArrayObjeto_S02L07(int capacidade){ 
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){ 
        return this.tamanho;
    }

    public boolean adiciona(T elemento){ 
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){ 
            this.elementos[this.tamanho] = elemento;
            this.tamanho++; 
            return true;
        }
        return false;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i< this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Busca por posição e retorna o elemento da posição especificada
    public Object busca(int posicao){ 
        if(!(posicao >= 0 && posicao < tamanho)){ 
            throw new IllegalArgumentException("Posição Inválida"); 
        }
        return elementos[posicao];
    }

    @Override
    public String toString(){ 
        StringBuilder s = new StringBuilder(); 
        s.append("[");

        for(int i = 0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }

    public int busca(T elemento){ 
        for(int i = 0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void adiciona(int posicao, T elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida"); 
        }
        this.aumentaCapacidade();
        //Mover todos os elementos
        for(int i = this.tamanho-1; i>= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for(int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }


}

public class Vetor_S02L06 {
    private String[] elementos;
    private int tamanho;

    //Construtor da classe
    public Vetor_S02L06(int capacidade){ 
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //Tamanho de um Vetor é diferente de capacidade
    public int tamanho(){ 
        return this.tamanho;
    }

    /* 
    -> Metodo de adicionar um valor numa posição ainda não preenchida. Não é tão eficiente para vetores muito grandes.
    public void adiciona(String elemento){ 
        for(int i = 0; i<this.elementos.length; i++){ 
            if(this.elementos[i] == null){ 
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    //Ao invés de percorrer todo o vetor até encontrar um espaço null para adicionar um novo elemento. Este método usa o índice "tamanho" para evitar percorrer todo o vetor.Assim ele sempre sabe onde parou anteriormente e já adiciona o novo elemento no espaço null
    public boolean adiciona(String elemento){ 
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){ 
            this.elementos[this.tamanho] = elemento;
            this.tamanho++; 
            return true;
        }
        return false;
    }

    //Sempre que qualquer coisa for adicionada no vetor, antes é verificado se ainda tem espaço. Se não tiver ele cria um novo vetor com o dobro de espaços do vetor anterior
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i = 0; i< this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Busca por posição e retorna o elemento da posição especificada
    public String busca(int posicao){ 
        if(!(posicao >= 0 && posicao < tamanho)){ 
            throw new IllegalArgumentException("Posição Inválida"); //Tratamento de erro caso a posição passada pelo usuario seja inválida
        }
        return elementos[posicao];
    }

    //Imprimir com toString objetos que estão dentro vetor, ignorando espaços vazios (null)
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

    //Busca por um elemento String, fazendo uma comparação dentro do vetor se há algum elemento dentro que seja igual ao que o usuário deseja buscar. Se não houver ele retorna -1
    public int busca(String elemento){ 
        for(int i = 0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    
    /*Adiciona um elemento em uma posição específica, movendo todos os elementos dos vetores para frente e adicionando o elemento na sua determinada posição 
    B C E F G null null-> posição a ser adicionada A (0)
    0 1 2 3 4   5   6-> tamanho é 7
    vetor[5] = vetor[4]
    vetor[4] = vetor[3]
    vetor[3] = vetor[2]
    vetor[2] = vetor[1]
    vetor[1] = vetor[0]
    ~loop encerrado~
    -> Após o término do loop:
    vetor[0] = elemento;
    */
    public void adiciona(int posicao, String elemento){
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


    /*Remove um elemento do vetor pré estabelecido por sua posição.
    B G D E F -> posição a ser removida G (1)
    0 1 2 3 4 -> tamanho é 5
    vetor[1] = vetor[2]
    vetor[2] = vetor[3]
    vetor[3] = vetor[4]
    */
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

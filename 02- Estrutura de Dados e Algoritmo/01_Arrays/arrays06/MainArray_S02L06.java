public class MainArray_S02L06 {
    public static void main(String[] args) {
        
        /* ##############################################################################################
        -> Adiciona elementos no vetor e Retorna todos os elementos do vetor, sem retornar os espaços null
        Vetor_S02L06 vetor = new Vetor_S02L06(5);
        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");

        System.out.println(vetor.toString());

        
        -> Busca elementos adicionados no vetor por uma posição especificada
        System.out.println("Elemento da posição 1: ");
        System.out.println(vetor.busca(1)); //Busca um elemento por posição

        Se a posição não existir, caí no Exception
        System.out.println("Elemento da posição 3: ");
        System.out.println(vetor.busca(3));*/

        /*##############################################################################################
        -> Adiciona elementos no vetor, e passa como parametro a posição que voce deseja adicionar um novo elemento E o elemento que quer adicionar
        Vetor_S02L06 vetor = new Vetor_S02L06(10);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor);

        vetor.adiciona(0, "A");
        System.out.println(vetor);

        vetor.adiciona(3, "D");
        System.out.println(vetor);*/

        /*##############################################################################################
        -> Tenta adicionar 5 elementos num vetor com capacidade para 3. Chamando assim o método aumentaCapacidade(), e dobrando a capacidade do vetor
        Vetor_S02L06 vetor = new Vetor_S02L06(3);
        vetor.adiciona("1");
        vetor.adiciona("2");
        vetor.adiciona("3");
        vetor.adiciona("4");
        vetor.adiciona("5");

        System.out.println(vetor);*/

        /*##############################################################################################
        -> Remove um determinado elemento passando sua posição*/
        Vetor_S02L06 vetor = new Vetor_S02L06(10);
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");
        int pos = vetor.busca("E");
        if(pos > -1){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);

    }
}

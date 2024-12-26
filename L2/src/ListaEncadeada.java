public class ListaEncadeada {

    private int[] elementos;
    int tamanho;

    // Construtor para criar uma lista vazia
    public ListaEncadeada() {
        elementos = new int[10]; // Inicializa com capacidade de 10 elementos
        tamanho = 0;
    }
    // Inserir elemento no início da Lista
    public void inserirNoInicio(int elemento) {

        //Verifica se a lista está cheia

        if (tamanho == elementos.length) {
            expandirCapacidade();
        }

        // Desloca os elementos existentes para o fim
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        // Insere o novo elemento no início
        elementos[0] = elemento;
        tamanho++;
    }

    // Inserir elemento em uma posição  específica da lista
    public void inserirNoFim(int elemento) {
        // Verifica se a lista está cheia
        if (tamanho == elementos.length) {
           expandirCapacidade();
        }

        //Insere o elemento no final

       elementos[tamanho] = elemento;
        tamanho++;
        }

        // Inserir elemento em uma posição específica da lista
       public void inserirNaPosicao(int elemento, int posicao){
        //
        }
        // Insere o novo elemento na posição
        elementos[posicao] = elemento;
        tamanho++;
    }

    //Remover elemento no ínicio da lista
    public int removerElemento() {
        // Verifica se a lista está vázia
        if (tamanho == 0) {
            throw new IllegalStateException("Lista vazia");
        }

        //Guarde o elemento a ser removido
        int elementoRemovido = elementos[0];
        //Desloca os elementos para o início
        for (int i = 1; i < tamanho;i++){

        }
        tamanho--;
        return elementoRemovido;
    }
    // Remover elemento em uma posição específica da Lista
    public int removerDaPosicao(int posicao){
        //Verifica se a posição é válida
        if (posicao < 0 || posicao>= tamanho){
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        // Guarda o elemento a ser removido
        int elementoRemovido = elementos[posicao];

        // Desloca os elementos para o inicio
        for (int i = posicao; i <tamanho; i++){
            elementos[i] = elementos[ i + 1];

        }
        tamanho--;
        return elementoRemovido;
    }

    // Remover um elemento específico da lista
    public void removerElemento(int elemento){
        for (int i = 0; i < tamanho; i++){
            if (elementos[i] == elemento){
                removerDaPosicao(i);
                return;
            }
        }
    }

    // Exibir o conteúdo da lista
     public void exibirLista(){
         System.out.println("[");
         for (int i = 0; i <tamanho; i++){
             System.out.println(elementos[i]);
             if (i < tamanho - 1){
                 System.out.println(", ");
             }
         }
         System.out.println("]");
     }

     // Pesquisar por um elemento específico na lista
    public int pesquisarElemento(int elemento){
        for (int i = 0; i<tamanho;i++){
            if (elementos[i] == elemento){
                return i; // Retorna a posição do elemento
            }
        }
        return -1; // Retorna -1 se o elemento não foi encontrado
    }

    // Retorna o número de elementos na lista
    public int tamanho(){
        return tamanho;
    }
   //Expande a capacidade do arranjo
    private void expandirCapacidade(){
        int[]novoElementos = new int[elementos.length *2];
        for (int i = 0; i < tamanho; i++){
            novoElementos[i] = elementos[i];
        }
        elementos = novoElementos;
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Inserir elementos
        lista. inserirNoInicio(5);
        lista.inserirNoIniciNoFim(10);
        lista.inserirNaPosicao(7, 1);

        //Exibir lista
        System.out.println("Lista:");
        lista.exibirLista();

       // Remover elementos
         lista.removerDoInicio();
         lista.removerDoFim();
         lista.removerDaPosicao(0);

         // Exibir lista novamente
        System.out.println("Lista após remoções :");
        lista.exibirLista();

        // Pesquisar elemento
        int posicao = lista.pesquisarElemento(7);
        if (posicao != -1) {
            System.out.println("Elemento 7 encontrado na posição:"+posicao);
        }else {
            System.out.println("Elemento 7 não encontrado.");
        }
        // Tamanho da lista
        System.out.println("Tamanho da lista :"+ lista.tamanho);
    }
}

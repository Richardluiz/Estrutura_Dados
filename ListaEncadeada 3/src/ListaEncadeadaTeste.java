public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Inserindo elementos
        lista.inserirFim(5);
        lista.inserirInicio(10);
        lista.inserirFim(20);
        lista.inserirPosicao(15, 2);

        // Exibindo a lista
        System.out.println("Lista:");
        lista.exibir();

        // Removendo elementos
        lista.removerInicio();
        lista.removerFim();
        lista.removerPosicao(1);
        lista.removerElemento(20);

        // Exibindo a lista novamente
        System.out.println("Lista após remoções:");
        lista.exibir();

        // Procurando um elemento
        int posicao = lista.procurar(15);
        if (posicao != -1) {
            System.out.println("O elemento 15 está na posição: " + posicao);
        } else {
            System.out.println("O elemento 15 não foi encontrado na lista.");
        }

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}


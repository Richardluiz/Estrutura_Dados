public class ListaEncadeada {

    private Node primeiro;

    // Classe interna para representar os nós da lista
    private static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    // Cria uma lista vazia
    public ListaEncadeada() {
        this.primeiro = null;
    }

    // Insere um elemento no início da lista
    public void inserirInicio(int valor) {
        Node novoNo = new Node(valor);
        novoNo.proximo = primeiro;
        primeiro = novoNo;
    }

    // Insere um elemento no fim da lista
    public void inserirFim(int valor) {
        Node novoNo = new Node(valor);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            Node atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Insere um elemento em uma posição específica da lista
    public void inserirPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanho()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            inserirInicio(valor);
        } else {
            Node novoNo = new Node(valor);
            Node atual = primeiro;
            for (int i = 1; i < posicao; i++) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }

    // Remove um elemento no início da lista
    public int removerInicio() {
        if (primeiro == null) {
            throw new RuntimeException("Lista está vazia");
        }
        int valor = primeiro.valor;
        primeiro = primeiro.proximo;
        return valor;
    }

    // Remove um elemento no fim da lista
    public int removerFim() {
        if (primeiro == null) {
            throw new RuntimeException("Lista está vazia");
        }
        if (primeiro.proximo == null) {
            int valor = primeiro.valor;
            primeiro = null;
            return valor;
        }
        Node atual = primeiro;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        int valor = atual.proximo.valor;
        atual.proximo = null;
        return valor;
    }

    // Remove um elemento em uma posição específica da lista
    public int removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            return removerInicio();
        }
        Node atual = primeiro;
        for (int i = 1; i < posicao; i++) {
            atual = atual.proximo;
        }
        int valor = atual.proximo.valor;
        atual.proximo = atual.proximo.proximo;
        return valor;
    }

    // Remove um elemento específico da lista
    public boolean removerElemento(int valor) {
        if (primeiro == null) {
            return false;
        }
        if (primeiro.valor == valor) {
            primeiro = primeiro.proximo;
            return true;
        }
        Node atual = primeiro;
        while (atual.proximo != null) {
            if (atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // Exibe o conteúdo de uma lista
    public void exibir() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
        } else {
            Node atual = primeiro;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    // Pesquisa por um elemento específico em uma lista
    public int procurar(int valor) {
        if (primeiro == null) {
            return -1;
        }
        Node atual = primeiro;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    // Retorna o número de elementos existentes na lista
    public int tamanho() {
        int tamanho = 0;
        Node atual = primeiro;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }
}
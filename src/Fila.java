public class Fila {
    private final int[] dados;
    private int primeiro;
    private int ultimo;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public boolean cheia() {
        return (ultimo + 1) % capacidade == primeiro;
    }

    public boolean vazia() {
        return primeiro == ultimo;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Fila cheia.");
            return;
        }
        dados[ultimo] = elemento;
        System.out.println("Elemento inserido: " + elemento);
        ultimo = (ultimo + 1) % capacidade;
    }

    public void remove() {
        if (vazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        int elementoRemovido = dados[primeiro];
        primeiro = (primeiro + 1) % capacidade;
        System.out.println("Elemento removido: " + elementoRemovido);
    }

    public void imprime() {
        int i = primeiro;
        while (i != ultimo) {

            System.out.println("Index: " + dados[i] + " Elemento: " + dados[i]);
            i = (i + 1) % capacidade;
        }
    }

}
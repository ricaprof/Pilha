public class Pilha {
    private int topo;
    private final int capacidade;
    private final int[] dados;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("[!] Pilha cheia.");
            return;
        }
        topo += 1;
        dados[topo] = elemento;
        System.out.println("[+] Elemento inserido: " + elemento);
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void remove() {
        if (vazia()) {
            System.out.println("[!] Pilha vazia.");
            return;
        }
        topo -= 1;
        System.out.println("[0] Elemento removido: " + dados[topo + 1]);
    }

    public void imprime() {
        for (int i = 0; i <= topo; i++) {
            System.out.println("Index " + i + " Elemento: " + dados[i]);
        }
    }
}
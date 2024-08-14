// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("...PILHA...\n");

        Pilha pilha = new Pilha(4);

        // Pilha
        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);

        pilha.imprime();
        pilha.remove();

        pilha.insere(4);

        pilha.imprime();
        pilha.remove();

        pilha.insere(5);

        pilha.imprime();


        System.out.println("\n...FILA...\n");

        // Fila
        Fila fila = new Fila(4);

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);

        fila.imprime();
        fila.remove();

        fila.insere(4);

        fila.imprime();
        fila.remove();

        fila.insere(5);

        fila.imprime();

    }

}
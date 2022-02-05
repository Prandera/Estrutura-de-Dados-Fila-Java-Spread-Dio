package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        //Agora a fila so aceita String.
        Fila<String> minhaFila = new Fila();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        //Atender o primeiro cliente da fila
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        //Adicionar o ultimo da fila
        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        //Pegar o primeiro da fila
        System.out.println(minhaFila.first());
        //Verificar se o first esta somente retornando o primeiro ou se ele tambem esta excluindo
        System.out.println(minhaFila);
    }
}

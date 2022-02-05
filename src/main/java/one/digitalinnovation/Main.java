package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        //Atender o primeiro cliente da fila
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        //Adicionar o ultimo da fila
        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

        //Pegar o primeiro da fila
        System.out.println(minhaFila.first());
        //Verificar se o first esta somente retornando o primeiro ou se ele tambem esta excluindo
        System.out.println(minhaFila);
    }
}

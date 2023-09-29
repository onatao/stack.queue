import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    
    // FIFO
    // FISRT INT FIRST OUT
    // PRIMEIRO a entrar PRIMEIRO ao sair
    // ULTIMO a entrar ULTIMO ao sair

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Nathan");
        fila.add("Arthur");
        fila.add("Luciana");
        fila.add("Elcio");

          // .peek() - topo da fila SEM remover - mostra e mantem
          System.out.println("Topo da fila: " + fila.peek());
          System.out.println(fila);
  
          // .poll() - topo da fila REMOVENDO - mostra e retira
          System.out.println("Topo da fila: " + fila.poll());
          System.out.println(fila); 

          fila.clear();

          System.out.println(
            fila.isEmpty() ? "Fila está vazia" :  fila.size()
        );
    }
}
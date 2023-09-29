import java.util.Stack;
 
public class StackExample {
    
    //  FIRST IN LAST OUT
    // PRIMEIRO a entrar ULTIMO ao sair.

    public static void main (String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Nathan");
        names.push("Arthur");
        names.push("Luciana");
        names.push("Elcio");

        // .peek() - topo da pilha SEM remover
        System.out.println("Topo da pilha: " + names.peek());
        System.out.println(names);

        // .pop() - topo da pilha REMOVENDO
        System.out.println("Topo da pilha: " + names.pop());
        System.out.println(names);

        // limpa pilha
        names.clear();

        System.out.println(
            names.empty() ? "Pilha está vazia" :  names.size()
        );
    }

}
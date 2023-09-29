import java.util.Scanner;

public class LinearSearch {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[8];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.random() * 100;
            System.out.println(vector[i]);
        }

        
        System.out.println("Number: ");
        int searched = sc.nextInt();

        boolean find = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == searched) {
                find = true;
                break;
            } 
        }
        System.out.println(find?"Achou":"Não achou");
    }
}

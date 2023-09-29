import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[8];

        for (int i =0; i < vector.length; i++) {
            vector[i] = i * 2;
            System.out.println(vector[i]);
        }

        boolean find = false;
        int start = 0;
        int end = vector.length - 1;
        int middle;

        System.out.println("Number: ");
        int searched = sc.nextInt();

        while(start <= end) {
            middle = (int) ((start + end) / 2);
            if (vector[middle] == searched) {
                find = true;
                System.out.println(vector[middle]);
                break;
            } else if (vector[middle] < searched) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (find == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
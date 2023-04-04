package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of terms: ");
        int terms = input.nextInt();
        fibonacci(terms);
        input.close();
    }

    private static void fibonacci(int terms) {
        int head = 1;
        int tail = 0;
        System.out.println(tail + "\n" + head);
        for (int i = 0; i < terms-2; i++) {
            int temp = head;
            head += tail;
            tail = temp;
            System.out.println(head);
        }
    }
}

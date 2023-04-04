package EvenorOdd;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        input.close();
    }
}

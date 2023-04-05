package MultiplicationTable;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        multiplication(num);
        input.close();
    }

    private static void multiplication(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}

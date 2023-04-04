package armstrong;

import java.util.LinkedList;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scan.nextInt();
        System.out.println(checker(input));
        scan.close();
    }
    private static boolean checker(int input) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int total = 0;
        while (input > 0) {
            stack.push(input%10);
            input = input / 10;
        }

        for (int element: stack) {
            total += Math.pow(element, stack.size());
        }
        if (Integer.compare(total, input) > 0) {
            return true;
        }
        return false;
    } 
}
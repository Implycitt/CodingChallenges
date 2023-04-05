package ReverseNum;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        System.out.println(concat(reverse(num)));
        input.close();
  }

  private static ArrayList<Integer> reverse(int num) {
    ArrayList<Integer> stack = new ArrayList<>();
    while(num > 0) {
      stack.add(num%10);
      num = num / 10;
    }
    return stack;
  }

  private static String concat(ArrayList<Integer> stack) {
    StringBuilder sb = new StringBuilder(stack.size());
    for (int digit : stack) {
        sb.append(digit);
    }
    return sb.toString();
  }
}
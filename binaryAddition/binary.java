package binaryAddition;

import java.util.Scanner;

public class binary {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter your first binary: ");
      String fbin = input.nextLine();
      System.out.print("Please enter your second binary: ");
      String sbin = input.nextLine();
      System.out.println(toBinary(toInt(fbin) + toInt(sbin)));
      input.close();
   } 

   private static int toInt(String binary) {
      return Integer.parseInt(binary, 2);
   }

   private static String toBinary(int integer) {
      return Integer.toBinaryString(integer);
   }
}

package compare;

import java.util.Scanner;

public class Compare {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstnum = input.nextInt();
        System.out.print("Please enter the second number: ");
        int secondnum = input.nextInt(); 
        compare(firstnum, secondnum);
        input.close();
   } 

   private static void compare(int num, int snum) {
    if (num > snum) {
        System.out.println(num + " > " + snum);
    }
    if (num < snum) {
        System.out.println(num + " < " + snum);
    }
    if (num >= snum) {
        System.out.println(num + " >= " + snum);
    }
    if (num <= snum) {
        System.out.println(num + " <= " + snum);
    }
    if (num == snum) {
        System.out.println(num + " == " + snum);
    }
    if (num != snum) {
        System.out.println(num + " != " + snum);
    }
   }
}

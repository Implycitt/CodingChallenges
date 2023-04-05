package SpeedingTicket;

import java.util.Scanner;

public class Speeding {
   private static boolean birthday() {
        int rand = (int) (Math.random() * 364 + 1);
        if (rand == 364) {
            return true;
        }
        return false;
   } 

   private static int checkSpeed(int speed) {
        if (speed <= 60) {
            return 0;
        } else if (speed > 60 && speed <= 80) {
            return 1;
        }
        return 2;
   }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your speed: ");
        int speed = input.nextInt();
        if (birthday()) {
            speed -= 5;
        }
        System.out.println(checkSpeed(speed));
        input.close();
   }
}

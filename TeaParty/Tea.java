package TeaParty;

import java.util.Scanner;

public class Tea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of tea: ");
        int tea = input.nextInt();
        System.out.print("Please enter the amount of candy: ");
        int candy = input.nextInt();
        System.out.println(conditions(tea, candy));
        input.close();
    }

    private static int conditions(int tea, int candy) {
        if (tea <= 5 && candy <= 5) {
            return 1;
        } else if (tea >= candy*2 || candy >= tea*2) {
            if (tea >= 5 && candy >= 5) {
                return 2;
            }
        }
        return 0;
    }
}

package ScoresAverage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        int i;
    }

    private static ArrayList<Integer> arr = new ArrayList<Integer>();

    private static void readFile() {
        try {
            File fin = new File("scores.in");
            Scanner input = new Scanner(fin);
            while (input.hasNextLine()) {
                Collection<? extends Integer> data = input.nextLine();
                arr.addAll(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error. File not found.");
            e.printStackTrace();
        }
    }
}

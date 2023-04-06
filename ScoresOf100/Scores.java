package ScoresOf100;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        try {
            List<Integer> arr = readIn();
            System.out.println(score(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> readIn() throws Exception {
        Scanner input = new Scanner(new BufferedReader(new FileReader("scores.in")));
        List<Integer> arr = new ArrayList<Integer>();
        while (input.hasNextLine()) {
            String[] line = input.nextLine().trim().split(" ");
            for (int j = 0; j < line.length; j++) {
                arr.add(Integer.parseInt(line[j]));
            }
        }
    return arr;
    }

    private static boolean score(List<Integer> arr) {
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) == arr.size()-1) {
                return false;
            }
            if (arr.get(i) == arr.get(i+1)) {
                return true;
            }
        }
        return false;
    }
}

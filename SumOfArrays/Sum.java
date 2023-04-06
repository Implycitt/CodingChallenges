package SumOfArrays;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try {
            int[][] arr = readIn();
            returnSum(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int[][] readIn() throws Exception {
        Scanner input = new Scanner(new BufferedReader(new FileReader("sum.in")));
        int rows = 2;
        int col = 2;
        int [][] arr = new int[rows][col];
        while (input.hasNextLine()) {
            for (int i = 0; i < arr.length; i++) {
                String[] line = input.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        return arr;
    }

    private static void returnSum(int[][] arr) {
        int sum1 = arr[0][0] + arr[0][1];
        int sum2 = arr[1][0] + arr[1][1];
        if (sum1 > sum2) {
            System.out.println("[" + arr[0][0] + ", " + arr[0][1] + "]");
        } else {
            System.out.println("[" + arr[1][0] + ", " + arr[1][1] + "]");
        }
    }
}
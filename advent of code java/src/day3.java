import sun.nio.ch.IOStatus;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.regex.MatchResult;
import java.lang.Character.*;

public class day3 {
    public static void main(String[] args) throws IOException {
        int one = partTwo(1,1);
        int two = partTwo(1,3);
        int three = partTwo(1,5);
        int four = partTwo(1,7);
        int five = partTwo(2,1);
        System.out.println("\n\n\n\n\n\n" + (one * two * three));
        System.out.println(four * five);
        // Combined them together manually, got a weird number, don't care enough
    }
    public static void partOne() throws IOException {
        // Width: 31 (loops)
        // Length: 323
        // Accumulation problem:
        int valid = 0;

        // Set up scanner
        Scanner in = new Scanner(new File("src/input.txt"));

        // Set up 2d array
        int HEIGHT = 323;
        int WIDTH = 31;
        String[][] list = new String[HEIGHT][WIDTH];

        for (int i = 0; i < HEIGHT; i++) {
            String iLine = in.nextLine();
            for (int j = 0; j < iLine.length(); j++) {
                list[i][j] = Character.toString(iLine.charAt(j));
            }
        }

        // Print all
        int x = 0;
        int y = 0;
        int trees = 0;

        while (x <= HEIGHT -1) {
            String s = list[x][y];
            list[x][y] = "O";
            if (s.equals("#")) {
                trees++;
                list[x][y] = "X";
            }
            if (y+3 > WIDTH -1) {
                y = (y + 3) - WIDTH;
            } else {
                y+= 3;
            }
            x++;
        }
        for (int i = 0; i < HEIGHT; i++) {
            System.out.println();
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(list[i][j]);
            }
        }
        System.out.println();
        System.out.println(trees);
    }
    public static int partTwo(int moveX, int moveY) throws IOException {
        // Width: 31 (loops)
        // Length: 323
        // Accumulation problem:
        int valid = 0;

        // Set up scanner
        Scanner in = new Scanner(new File("src/input.txt"));

        // Set up 2d array
        int HEIGHT = 323;
        int WIDTH = 31;
        String[][] list = new String[HEIGHT][WIDTH];

        for (int i = 0; i < HEIGHT; i++) {
            String iLine = in.nextLine();
            for (int j = 0; j < iLine.length(); j++) {
                list[i][j] = Character.toString(iLine.charAt(j));
            }
        }

        // Print all
        int x = 0;
        int y = 0;
        int trees = 0;

        while (x <= HEIGHT -1) {
            String s = list[x][y];
            list[x][y] = "O";
            if (s.equals("#")) {
                trees++;
                list[x][y] = "X";
            }
            if (y+moveY > WIDTH -1) {
                y = (y + moveY) - WIDTH;
            } else {
                y+= moveY;
            }
            x+= moveX;
        }
        // Magic number to shorten actual printing
        for (int i = 0; i < 30; i++) {
            System.out.println();
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(list[i][j]);
            }
        }
        System.out.println();
        System.out.println(trees);
        return trees;
    }

}

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class day1 {
    public static void main(String[] args) throws IOException {

        // Scanning from input.txt. Going line by line until finished
        Scanner in = new Scanner(new File("src/input.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (in.hasNext()) {
            list.add(Integer.parseInt(in.next()));
        }

        // Check if there's a number that can add up to 2020. Print the product if so
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            int delta = Math.abs(list.get(i) - 2020);
            if (list.contains(delta)) {
                System.out.println(list.get(i) * delta);
            }
        }
    }
}

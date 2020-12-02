import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class day1P2 {
    public static void main(String[] args) throws IOException {

        // Scanning from input.txt. Going line by line until finished
        Scanner in = new Scanner(new File("src/input.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (in.hasNext()) {
            list.add(Integer.parseInt(in.next()));
        }

        // Dummy data
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1721);
//        list.add(979);
//        list.add(366);
//        list.add(299);
//        list.add(675);
//        list.add(1456);


        // Check if there's a number that can add up to 2020. Print the product if so
        for (int i = 0; i < list.size(); i++) {
            // Getting i for n^2 iteration size
            int x = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                // True basic iteration
                int y = list.get(j);
                int toLocate = 2020 - x - y;
                if (list.contains(toLocate)) {
                    System.out.println(String.format("Found with: x=%d, y=%d, z=%d",x,y,toLocate));
                    System.out.println(x*y*toLocate + "\n");
                }
            }
        }
    }
}

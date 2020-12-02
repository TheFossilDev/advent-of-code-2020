import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.regex.MatchResult;
import java.lang.Character.*;

public class day2 {
    public static void main(String[] args) throws IOException {
        partTwo();

    }
    public static void partOne() throws IOException {
        // Accumulation problem:
        int valid = 0;

        // Set up scanner
        Scanner in = new Scanner(new File("src/input.txt"));
        ArrayList<String> list = new ArrayList<String>();






        while (in.hasNext()) {
            in.findInLine("(\\d+)-(\\d+) (\\w+): (\\w+)");
            MatchResult result = in.match();
            int min = Integer.parseInt(result.group(1));
            int max = Integer.parseInt(result.group(2));
            String rule = result.group(3);
            String pwd = result.group(4);
            in.nextLine();

            int ruleCount = 0;
            for (int i = 0; i < pwd.length(); i++) {
                String questionChar = Character.toString(pwd.charAt(i));
                if (questionChar.equals(rule)) {
                    ruleCount++;
                }
            }
            if (ruleCount >= min && ruleCount <= max) {
                valid++;
                System.out.println(String.format("min: %d max: %d rule: %s pwd: %s",min,max,rule,pwd));
            }
        }
        System.out.println(valid + " acceptable passwords.");

//        for (int i = 0; i < list.size(); i++) {
//
//        }

    }
    public static void partTwo() throws IOException {
        // Accumulation problem:
        int valid = 0;

        // Set up scanner
        Scanner in = new Scanner(new File("src/input.txt"));
        ArrayList<String> list = new ArrayList<String>();






        while (in.hasNext()) {
            in.findInLine("(\\d+)-(\\d+) (\\w+): (\\w+)");
            MatchResult result = in.match();
            int pos1 = Integer.parseInt(result.group(1));
            int pos2 = Integer.parseInt(result.group(2));
            String rule = result.group(3);
            String pwd = result.group(4);
            in.nextLine();

            int numPassing = 0;
            for (int i = 0; i < pwd.length(); i++) {
                String questionChar = Character.toString(pwd.charAt(i));
                if (i+1 == pos1 && questionChar.equals(rule)) {
                    numPassing++;
                }
                if ((i+1 == pos2 && questionChar.equals(rule))) {
                    numPassing++;
                }
            }
            if (numPassing == 1) {
                valid++;
                System.out.println(String.format("pos1: %d pos2: %d rule: %s pwd: %s",pos1,pos2,rule,pwd));
            }
        }
        System.out.println(valid + " acceptable passwords.");

//        for (int i = 0; i < list.size(); i++) {
//
//        }

    }
}

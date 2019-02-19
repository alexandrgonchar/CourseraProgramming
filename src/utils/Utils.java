package utils;

import java.util.ArrayList;


public class Utils {
    public static void sortBySecondColumn(ArrayList<String> list) {
        list.sort((String s, String t1) -> {
            int first = Integer.parseInt(s.split(" ")[1]);
            int second = Integer.parseInt(t1.split(" ")[1]);
            return first - second;
        });
    }

    public static void fillMassives (int[] leftMass, int[] rightMass, ArrayList<String> lines) {
        for (int i = 0; i < rightMass.length; i++) {
            String line[] = lines.get(i).split(" ");

            leftMass[i] = Integer.parseInt(line[0]);
            rightMass[i] = Integer.parseInt(line[1]);
        }
    }
}

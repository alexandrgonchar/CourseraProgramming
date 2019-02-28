package utils;

import java.util.ArrayList;


public class Utils {
    public static void sortBySecondColumn(ArrayList<String> list) {
        list.sort((String s, String t1) -> {
            int first = getInt(s.split(" ")[1]);
            int second = getInt(t1.split(" ")[1]);
            return first - second;
        });
    }

    public static void fillMassives (int[] leftMass, int[] rightMass, ArrayList<String> lines) {
        for (int i = 0; i < rightMass.length; i++) {
            String line[] = lines.get(i).split(" ");

            leftMass[i] = getInt(line[0]);
            rightMass[i] = getInt(line[1]);
        }
    }

    public static void fillLists (ArrayList<Integer> leftList, ArrayList<Integer> rightList, ArrayList<String> lines) {
        for (int i = 0; i < rightList.size(); i++) {
            String line[] = lines.get(i).split(" ");

            leftList.add(getInt(line[0]));
            rightList.add(getInt(line[1]));
        }
    }

    public static void sortByCost (ArrayList<String> list) {
        list.sort((String s, String t1) -> {
            String firstLine[] = s.split(" ");
            String secondLine[] = t1.split(" ");

            int first = getInt(firstLine[1]) / getInt(firstLine[0]);
            int second = getInt(secondLine[1]) / getInt(secondLine[0]);

            return second - first;
        });
    }

    public static int getInt (String line) {
        return Integer.parseInt(line);
    }
}

package sport_programming.module_2.second_test;

import utils.MyFileReader;
import utils.Utils;

import java.util.ArrayList;

public class BackpackTask {
    private int n;
    private int maxWeight;
    private ArrayList<String> subjects;

    BackpackTask (MyFileReader reader) {
        subjects = new ArrayList<>(reader.readFile());

        String line[] = subjects.get(0).split(" ");
        n = Integer.parseInt(line[0]);
        maxWeight = Integer.parseInt(line[1]);

        subjects.remove(0);

        Utils.sortByCost(subjects);
    }

    int robbery () {
        int result = 0;

        for (String line : subjects) {
            int weight = Integer.parseInt(line.split(" ")[0]);
            int cost = Integer.parseInt(line.split(" ")[1]);

            if (maxWeight > weight) {
                result += cost;
                maxWeight -= weight;
            } else {
                result += maxWeight * (cost / weight);
                break;
            }
        }

        return result;
    }
}

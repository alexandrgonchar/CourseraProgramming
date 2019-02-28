package sport_programming.module_2.second_test;

import utils.MyFileReader;
import utils.Utils;

import java.util.ArrayList;

class InfinityRequest {
    private ArrayList<Integer> indexes;
    private int[] leftBorder;
    private int[] rightBorder;


    InfinityRequest (MyFileReader reader) {
        ArrayList<String> requests = new ArrayList<>(reader.readFile());
        indexes = new ArrayList<>();

        int n = Integer.parseInt(requests.get(0));

        requests.remove(0);

        Utils.sortBySecondColumn(requests);

        rightBorder = new int[n];
        leftBorder = new int[n];

        Utils.fillMassives(leftBorder, rightBorder, requests);
    }

    int minCount () {
        int count = indexes.size();

        while (!indexes.isEmpty()) {
            count -= getCountOfRequests();
        }

        return count + 1;
    }

    private int getCountOfRequests () {
        int count = 1;
        int last = indexes.remove(0);

        ArrayList<Integer> localIndexes = new ArrayList<>();

        for (int i : indexes) {
            if (leftBorder[i] >= rightBorder[last]) {
                count++;
                last = i;
            }
            else localIndexes.add(i);
        }

        indexes = localIndexes;

        if (count == 1) return 0;
        return count;
    }
}

package sport_programming.module_2.first_test;

import utils.MyFileReader;
import utils.Utils;

import java.util.ArrayList;

class Request {
    private final int n;
    private final int[] leftBorder;
    private final int[] rightBorder;


    Request (MyFileReader reader) {
        ArrayList<String> requests = new ArrayList<>(reader.readFile());
        n = Integer.parseInt(requests.get(0));

        requests.remove(0);
        Utils.sortBySecondColumn(requests);

        leftBorder = new int[n];
        rightBorder = new int[n];

        Utils.fillMassives(leftBorder, rightBorder, requests);
    }

    int getCountOfRequests () {
        int count = 1;
        int last = 0;

        for (int i = 1; i < n; i++) {
            if (leftBorder[i] >= rightBorder[last]) {
                count++;
                last = i;
            }
        }

        return count;
    }
}

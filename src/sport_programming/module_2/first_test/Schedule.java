package sport_programming.module_2.first_test;

import utils.MyFileReader;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

class Schedule {
    private final int n;
    private final int[] deadline;
    private final int[] costs;
    private boolean[] used;

    Schedule(MyFileReader reader) {
        ArrayList<String> schedule = new ArrayList<>(reader.readFile());
        n = Integer.parseInt(schedule.get(0));

        schedule.remove(0);
        Utils.sortBySecondColumn(schedule);

        deadline = new int[n];
        costs = new int[n];
        Utils.fillMassives(deadline, costs, schedule);

        OptionalInt optional = Arrays.stream(deadline).max();

        if (optional.isPresent())
            used = new boolean[optional.getAsInt() + 1];
    }

    long getMaxSum () {
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int k = deadline[i];

            while (k >= 1 && used[k]) k--;

            if (k == 0) continue;

            used[k] = true;
            sum += costs[i];

        }
        return sum;
    }
}

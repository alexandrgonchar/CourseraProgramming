package sport_programming.module_2.first_test;

import utils.MyFileReader;

import java.util.ArrayList;

class Trip {
    private final int n;
    private final int allDistance;
    private final int maxDistance;
    private final ArrayList<String> road;
    private int[] petrolStations;

    Trip (MyFileReader reader) {
        road = new ArrayList<>(reader.readFile());

        String[] firstLine = road.get(0).split(" ");

        n = Integer.parseInt(firstLine[0]);
        allDistance = Integer.parseInt(firstLine[1]);
        maxDistance = Integer.parseInt(firstLine[2]);

        fillPetrols();
    }

    int drive () {
        int count = 1;
        int road = maxDistance;

        for (int i = 0; i < n - 1; i++) {
            if (petrolStations[i + 1] >= road) {

                road = petrolStations[i] + maxDistance;

                count++;
            }
        }

        return count;
    }

    private void fillPetrols() {
        petrolStations = new int[n];
        String secondLine[] = road.get(1).split(" ");

        for (int i = 0; i < n; i++) {
            petrolStations[i] = Integer.parseInt(secondLine[i]);
        }
    }
}

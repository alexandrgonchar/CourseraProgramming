package sport_programming.module_1.second_test;

import utils.MatrixReader;

class FourthTask {
    private final int n;
    private final int[][] roads;
    private final int[] path;
    private final boolean[] used;
    private int answer = Integer.MAX_VALUE;

    FourthTask () {
        MatrixReader reader = new MatrixReader();
        n = reader.getMatrixSize();
        System.out.println(n);
        roads = reader.getMatrix();

        path = new int[n];
        path[0] = 0;
        used = new boolean[n];
    }

    void recursive (int index, int length) {
        if (length >= answer) return;

        if (index == n) {
            answer = Math.min(answer, length + roads[path[index - 1]][0]);
            return;
        }

        for (int i = 1; i <= n - 1; i++) {

            if (used[i]) continue;

            path[index] = i;
            used[i] = true;
            recursive(index + 1, length + roads[path[index - 1]][i]);
            used[i] = false;
        }
    }

    int getAnswer () {
        return answer;
    }
}

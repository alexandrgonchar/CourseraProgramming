package modul_1;

public class FourthTask {
    private int n;
    private int[][] roads;
    private int[] path;
    private boolean[] used;
    private int answer = Integer.MAX_VALUE;

    public FourthTask () {
        MatrixReader reader = new MatrixReader();
        n = reader.getMatrixSize();
        System.out.println(n);
        roads = reader.getMatrix();

        path = new int[n];
        path[0] = 0;
        used = new boolean[n];
    }

    public void recursive (int index, int length) {
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

//    private int pathCount () {
//        int result = 0;
//
//        for (int i = 0; i < path.length - 1; i++) {
//            result += roads[path[i]][path[i + 1]];
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        FourthTask task = new FourthTask();
        task.recursive(1, 0);

        for (int i : task.path) {
            System.out.print(i + " ");
        }

        System.out.println(task.answer);
    }
}

package utils;

import java.util.ArrayList;

public class MatrixReader {
    private final ArrayList<String> strings;
    private final int n;
    private final int[][] matrix;

    public MatrixReader (MyFileReader reader) {
        strings = new ArrayList<>(reader.readFile());

        n = Integer.parseInt(strings.get(0));
        matrix = new int[n][n];

        strings.remove(0);
        setMatrix();
    }



    private void setMatrix () {
        int i = 0;

        for (String str : strings) {
            fillLine(i, str);
            i++;
        }
    }

    private void fillLine (int index, String line) {
        String[] lines = line.split(" ");

        for (int i = 0; i < n; i++) {
            matrix[index][i] = Integer.parseInt(lines[i]);
        }
    }

    public int getMatrixSize () {
        return n;
    }

    public int[][] getMatrix () {
        return matrix;
    }
}

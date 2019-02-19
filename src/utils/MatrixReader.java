package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MatrixReader {
    private final ArrayList<String> strings;
    private final int n;
    private final int[][] matrix;

    private static final String FILE_NAME = "/home/azathoth/IdeaProjects/CourseraPrograming/resources/matrix.txt";

    public MatrixReader () {
        strings = new ArrayList<>();
        readFile();

        n = Integer.parseInt(strings.get(0));
        matrix = new int[n][n];

        strings.remove(0);
        setMatrix();
    }

    private void readFile () {
        try {
            Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(strings::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

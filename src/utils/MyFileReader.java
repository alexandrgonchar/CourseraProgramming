package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
    private final String fileName;

    public MyFileReader (String fileName) {
        this.fileName = fileName;
    }

    public List<String> readFile () {
        ArrayList<String> strings = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(strings::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return strings;
    }
}

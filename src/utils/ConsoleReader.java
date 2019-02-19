package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int readInt () {
        StringBuilder string = null;
        boolean isDigit = false;

        while (!isDigit) {
            string = new StringBuilder(readString());
            isDigit = string.chars().allMatch(Character::isDigit);
        }

        return Integer.parseInt(string.toString());
    }

    public String readString () {
        String result = "";

        try  {
            String str = reader.readLine();
            if (str != null) result = str;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void close () {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

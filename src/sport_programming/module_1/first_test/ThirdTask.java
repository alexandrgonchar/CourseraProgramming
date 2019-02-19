package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class ThirdTask {
    private final String brackets;

    ThirdTask (ConsoleReader reader) {
        brackets = reader.readString();
    }

    boolean isCorrect () {
        int balance = 0;

        for (char character : brackets.toCharArray()) {
            if (character == '(') balance++;

            else  balance--;

            if (balance < 0) return false;
        }

        return balance == 0;
    }
}

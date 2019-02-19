package sport_programming.module_1.second_test;

import utils.ConsoleReader;

class FirstTask {
    private final int n;
    private final int numberOfSeq;
    private int counter = 0;
    private final char[] brackets;

    FirstTask () {
        ConsoleReader reader = new ConsoleReader();

        n = reader.readInt();
        numberOfSeq = reader.readInt();

        brackets = new char[2 * n];

        reader.close();
    }

    void recursive (int index, int balance) {
        if (index == 2 * n) {
            if (balance == 0) {
                counter++;

                if (counter == numberOfSeq) print();
            }

            return;
        }

        brackets[index] = '(';
        recursive(index + 1, balance + 1);

        if (balance == 0) return;

        brackets[index] = ')';
        recursive(index + 1, balance - 1);
    }

    private void print () {
        for (char ch : brackets) System.out.print(ch);

        System.out.println();
    }
}

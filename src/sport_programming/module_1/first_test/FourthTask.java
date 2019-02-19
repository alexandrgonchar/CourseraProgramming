package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class FourthTask {
    private final int n;
    private final int[] combination;

    FourthTask () {
        n = ConsoleReader.readInt();
        combination = new int[n];

        ConsoleReader.close();
    }

    private void print (int index) {
        for (int i = 0; i < index; i++) {
            if (i == index - 1) System.out.print(combination[i]);

            else System.out.print(combination[i] + " + ");
        }
        System.out.println();
    }

    void recursive (int index, int sum, int last) {
        if (sum == n) {
            print(index);
            return;
        }

        for (int i = last; i <= n - sum; i++) {
            combination[index] = i;
            recursive(index + 1, sum + i, i);
        }
    }
}

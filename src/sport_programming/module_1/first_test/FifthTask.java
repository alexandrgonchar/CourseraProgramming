package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class FifthTask {
    private final int n;
    private final int numberOfSeq;
    private int count;
    private final int[] combination;

    FifthTask () {
        System.out.println("n = ");
        n = ConsoleReader.readInt();
        combination = new int[n];

        System.out.println("number of seq = ");
        this.numberOfSeq = ConsoleReader.readInt();
        count = 0;

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
            count++;
            if (count == numberOfSeq) print(index);
            return;
        }

        for (int i = last; i <= n - sum; i++) {
            combination[index] = i;
            recursive(index + 1, sum + i, i);
        }
    }
}

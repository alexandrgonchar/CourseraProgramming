package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class SecondTask {
    private final int n;
    private final int numberOfSeq;
    private final int[] sequences;
    private final boolean[] used;
    private int count;

    SecondTask () {
        System.out.println("n = ");
        this.n = ConsoleReader.readInt();

        System.out.println("number of seq = ");
        this.numberOfSeq = ConsoleReader.readInt();
        count = 0;
        sequences = new int[n];
        used = new boolean[n + 1];

        ConsoleReader.close();
    }

    private void print () {
        for (int number : sequences) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    void recursive (int index) {

        if (index == n) {
            count++;
            if (count == numberOfSeq) {
                print();
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (used[i]) continue;

            sequences[index] = i;
            used[i] = true;
            recursive(index + 1);
            used[i] = false;
        }
    }
}

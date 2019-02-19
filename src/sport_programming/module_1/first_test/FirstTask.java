package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class FirstTask {
    private final int n;
    private final int m;
    private final int numberOfSeq;
    private final int[] sequences;
    private int count;

    FirstTask () {
        System.out.println("n = ");
        this.n = ConsoleReader.readInt();

        System.out.println("m = ");
        this.m = ConsoleReader.readInt();

        System.out.println("number of seq = ");
        this.numberOfSeq = ConsoleReader.readInt();
        count = 0;
        sequences = new int[n];

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
            if (count == numberOfSeq) print();
            System.out.println(count);
            return;
        }

        for (int i = 1; i <= m; i++) {
            sequences[index] = i;
            recursive(index + 1);
        }
    }
}

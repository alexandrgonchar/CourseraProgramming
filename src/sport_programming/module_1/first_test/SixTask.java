package sport_programming.module_1.first_test;

import utils.ConsoleReader;

class SixTask {
    private final int n;
    private final int m;
    private int recurCounter = 1;
    private final int numberOfSeq;
    private final int[] field;

    SixTask () {
        System.out.println("n = ");
        n = ConsoleReader.readInt();

        System.out.println("m = ");
        m = ConsoleReader.readInt();

        System.out.println("number of sequences = ");
        numberOfSeq = ConsoleReader.readInt();

        field = new int[n];

        ConsoleReader.close();
    }

    void recursive (int index, int mCounter, boolean isOne, int num) {
        if (mCounter == m) {
            if (recurCounter == numberOfSeq) print();

            recurCounter++;
            return;
        }

        if (index == n) return;

        if (!isOne && num == 1){
            field[index] = 1;
            mCounter++;
            recursive(index + 1, mCounter, true, 0);
        } else {
            field[index] = 0;
            recursive(index + 1, mCounter, false, 1);
            recursive(index + 1, mCounter, false, 0);
        }
    }

    private void print(){
        for (int aField : field) System.out.print(aField);

        System.out.println();
    }
}

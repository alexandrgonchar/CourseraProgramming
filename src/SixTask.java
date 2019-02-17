import modul_1.ConsoleReader;

public class SixTask {
    private int n;
    private int m;
    private int recurCounter = 1;
    private int numberOfSeq;
    private int[] field;

    public SixTask () {
        System.out.println("n = ");
        n = ConsoleReader.readInt();

        System.out.println("m = ");
        m = ConsoleReader.readInt();

        System.out.println("number of sequences = ");
        numberOfSeq = ConsoleReader.readInt();

        field = new int[n];

        ConsoleReader.close();
    }

    private void recursive (int index, int mCounter, boolean isOne, int num) {
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

    public static void main(String[] args) {
        SixTask task = new SixTask();

        task.recursive(0, 0, false, 1);
        task.recursive(0, 0, false, 0);
    }
}

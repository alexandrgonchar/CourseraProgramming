import modul_1.ConsoleReader;

public class FirstTask {
    private int n;
    private int m;
    private int numberOfSeq;
    private int[] sequences;
    private int count;

    private FirstTask () {
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

    private void recursive (int index) {

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

    public static void main(String[] args) {
        FirstTask task = new FirstTask();
        task.recursive(0);
    }
}

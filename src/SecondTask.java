import modul_1.ConsoleReader;

public class SecondTask {
    private int n;
    private int numberOfSeq;
    private int[] sequences;
    private boolean[] used;
    private int count;

    private SecondTask () {
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

    private void recursive (int index) {

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

    public static void main(String[] args) {
        SecondTask task = new SecondTask();
        task.recursive(0);
    }
}

import modul_1.ConsoleReader;

public class FifthTask {
    private int n;
    private int numberOfSeq;
    private int count;
    private int[] combination;

    private FifthTask () {
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

    private void recursive (int index, int sum, int last) {
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

    public static void main(String[] args) {
        FifthTask task = new FifthTask();
        task.recursive(0, 0, 1);
    }
}

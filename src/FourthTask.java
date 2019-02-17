import modul_1.ConsoleReader;

public class FourthTask {
    private int n;
    private int[] combination;

    private FourthTask () {
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

    private void recursive (int index, int sum, int last) {
        if (sum == n) {
            print(index);
            return;
        }

        for (int i = last; i <= n - sum; i++) {
            combination[index] = i;
            recursive(index + 1, sum + i, i);
        }
    }

    public static void main(String[] args) {
        FourthTask task = new FourthTask();
        task.recursive(0, 0, 1);
    }
}

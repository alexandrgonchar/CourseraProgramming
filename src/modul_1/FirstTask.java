package modul_1;

public class FirstTask {
    private int n;
    private int numberOfSeq;
    private int counter = 0;
    private char[] brackets;

    public FirstTask () {
        n = ConsoleReader.readInt();
        numberOfSeq = ConsoleReader.readInt();

        brackets = new char[2 * n];
    }

    private void recursive (int index, int balance) {
        if (index == 2 * n) {
            if (balance == 0) {
                counter++;

                if (counter == numberOfSeq) print();
            }

            return;
        }

        brackets[index] = '(';
        recursive(index + 1, balance + 1);

        if (balance == 0) return;

        brackets[index] = ')';
        recursive(index + 1, balance - 1);
    }

    private void print () {
        for (char ch : brackets) System.out.print(ch);

        System.out.println();
    }

    public static void main(String[] args) {
        FirstTask task = new FirstTask();

        task.recursive(0, 0);
    }
}

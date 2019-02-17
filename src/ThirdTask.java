import modul_1.ConsoleReader;

public class ThirdTask {
    private String brackets;

    private ThirdTask () {

        brackets = ConsoleReader.readString();
        ConsoleReader.close();
    }

    private boolean isCorrect () {
        int balance = 0;

        for (char character : brackets.toCharArray()) {
            if (character == '(') balance++;

            else  balance--;

            if (balance < 0) return false;
        }

        return balance == 0;
    }

    public static void main(String[] args) {
        ThirdTask task = new ThirdTask();

        System.out.println(task.isCorrect());
    }
}

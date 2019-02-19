package sport_programming.module_1.first_test;


import utils.ConsoleReader;

class Main {
    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();

        FirstTask firstTask = new FirstTask(reader);
        firstTask.recursive(0);

        SecondTask secondTask = new SecondTask(reader);
        secondTask.recursive(0);

        ThirdTask thirdTask = new ThirdTask(reader);
        System.out.println(thirdTask.isCorrect());

        FourthTask fourthTask = new FourthTask(reader);
        fourthTask.recursive(0, 0, 1);

        FifthTask fifthTask = new FifthTask(reader);
        fifthTask.recursive(0, 0, 1);

        SixTask sixTask = new SixTask(reader);
        sixTask.recursive(0, 0, false, 1);
        sixTask.recursive(0, 0, false, 0);

        reader.close();
    }
}

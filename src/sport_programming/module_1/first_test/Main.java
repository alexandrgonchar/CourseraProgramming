package sport_programming.module_1.first_test;


class Main {
    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        firstTask.recursive(0);

        SecondTask secondTask = new SecondTask();
        secondTask.recursive(0);

        ThirdTask thirdTask = new ThirdTask();
        System.out.println(thirdTask.isCorrect());

        FourthTask fourthTask = new FourthTask();
        fourthTask.recursive(0, 0, 1);

        FifthTask fifthTask = new FifthTask();
        fifthTask.recursive(0, 0, 1);

        SixTask sixTask = new SixTask();
        sixTask.recursive(0, 0, false, 1);
        sixTask.recursive(0, 0, false, 0);
    }
}

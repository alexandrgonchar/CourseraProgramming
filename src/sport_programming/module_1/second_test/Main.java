package sport_programming.module_1.second_test;

class Main {
    public static void main(String[] args) {
        FirstTask task = new FirstTask();
        task.recursive(0, 0);

        FourthTask fourthTask = new FourthTask();
        fourthTask.recursive(1, 0);
        System.out.println(fourthTask.getAnswer());
    }
}

package sport_programming.module_1.second_test;

import utils.MyFileReader;

class Main {
    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/matrix.txt");

        FirstTask task = new FirstTask();
        task.recursive(0, 0);

        FourthTask fourthTask = new FourthTask(reader);
        fourthTask.recursive(1, 0);
        System.out.println(fourthTask.getAnswer());
    }
}

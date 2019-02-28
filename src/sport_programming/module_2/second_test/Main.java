package sport_programming.module_2.second_test;

import utils.MyFileReader;

public class Main {
    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/cont.txt");

        BackpackTask backpackTask = new BackpackTask(reader);
        System.out.println(backpackTask.robbery());

        System.out.println();
        System.out.println();
        System.out.println("Second!!!");
        MyFileReader reader1 = new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/cont2.txt");
        BackpackTask backpackTask1 = new BackpackTask(reader1);
        System.out.println(backpackTask1.robbery());

        System.out.println();
        System.out.println();
        System.out.println("Request: ");
        MyFileReader reader3 = new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/inf_request.txt");
        InfinityRequest request = new InfinityRequest(reader3);
        System.out.println(request.minCount());
    }
}

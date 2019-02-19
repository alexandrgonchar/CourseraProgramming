package sport_programming.module_2.first_test;

import utils.MyFileReader;

class Main {
    public static void main(String[] args) {
        Schedule schedule1 = new Schedule(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/schedule.txt"));
        System.out.println(schedule1.getMaxSum());


        Schedule schedule2 = new Schedule(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/schedule2.txt"));
        System.out.println(schedule2.getMaxSum());


        Request request = new Request(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/request.txt"));
        System.out.println(request.getCountOfRequests());


        Request request1 = new Request(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/request2.txt"));
        System.out.println(request1.getCountOfRequests());


        Trip trip = new Trip(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/petrol.txt"));
        System.out.println(trip.drive());


        Trip trip1 = new Trip(new MyFileReader(
                "/home/azathoth/IdeaProjects/CourseraPrograming/resources/petrol2.txt"));
        System.out.println(trip1.drive());
    }
}

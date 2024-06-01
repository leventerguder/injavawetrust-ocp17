package chapter13.introducing_annotations.example03;

public class Peacock {
    @ZooSchedule(hours = {"4am", "5pm"})
    void cleanPeacocksPen() {
        System.out.print("Time to sweep up!");
    }
}
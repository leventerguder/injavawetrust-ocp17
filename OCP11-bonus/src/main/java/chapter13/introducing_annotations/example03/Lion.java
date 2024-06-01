package chapter13.introducing_annotations.example03;

public class Lion {
    @ZooSchedule(hours = {"9am", "5pm", "10pm"})
    void feedLions() {
        System.out.print("Time to feed the lions!");
    }
}
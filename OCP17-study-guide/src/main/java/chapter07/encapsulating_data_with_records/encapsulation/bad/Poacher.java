package chapter07.encapsulating_data_with_records.encapsulation.bad;

public class Poacher {
    public void badActor() {
        var mother = new Crane(5, "Cathy");
        mother.numberEggs = -100;
    }
}
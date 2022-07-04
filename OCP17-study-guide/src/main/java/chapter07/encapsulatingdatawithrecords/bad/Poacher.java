package chapter07.encapsulatingdatawithrecords.bad;

public class Poacher {
    public void badActor() {
        var mother = new Crane(5, "Cathy");
        mother.numberEggs = -100;
    }
}
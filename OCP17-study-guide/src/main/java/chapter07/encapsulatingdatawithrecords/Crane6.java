package chapter07.encapsulatingdatawithrecords;

public record Crane6(int numberEggs, String name) {
    //While compact constructors can modify the constructor parameters,
    // they cannot modify the fields of the record. For example, this does not compile:

    public Crane6 {
        numberEggs = 20;
        //this.numberEggs = 10; // DOES NOT COMPILE
    }
}

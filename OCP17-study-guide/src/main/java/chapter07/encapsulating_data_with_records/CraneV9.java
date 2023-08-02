package chapter07.encapsulating_data_with_records;

public record CraneV9(int numberEggs, String name) {
    //While compact constructors can modify the constructor parameters,
    // they cannot modify the fields of the record. For example, this does not compile:

    public CraneV9 {
        numberEggs = 20; //constructor parameter. Not field!
        //this.numberEggs = 10; // DOES NOT COMPILE
    }
}

package chapter07.encapsulating_data_with_records;

public record Crane8(int numberEggs, String name) {
    public Crane8(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
        //this.numberEggs = 20; // DOES NOT COMPILE
    }
}
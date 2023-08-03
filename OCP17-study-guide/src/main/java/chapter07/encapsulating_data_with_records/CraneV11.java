package chapter07.encapsulating_data_with_records;

public record CraneV11(int numberEggs, String name) {
    public CraneV11(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
        //this.numberEggs = 20; // DOES NOT COMPILE

        System.out.println("CraneV11 - constructor invoked...");
    }
}
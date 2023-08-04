package chapter07.encapsulating_data_with_records;

public record CraneV10(int numberEggs, String name) {
    public CraneV10(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
        System.out.println("CraneV10 - constructor invoked...");
    }

    public CraneV10() {
        // Non-canonical record constructor must delegate to another constructor.
        this(10, "dummy");

//        this.numberEggs = 10;
//        this.name = "dummy";

    }

    //
    public CraneV10(int numberEggs) {
        // Non-canonical record constructor must delegate to another constructor.
        this(numberEggs, "dummy");
        // this.numberEggs = numberEggs;
        // this.name = "dummy";
    }

    public CraneV10(String name, int numberEggs) {
        // Non-canonical record constructor must delegate to another constructor.
        this(numberEggs);
        // this.numberEggs = numberEggs;
    }

}

package chapter07.encapsulating_data_with_records;

public record CraneV10(int numberEggs, String name) {
    public CraneV10(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
        System.out.println("constructor invoking...");
    }

//    public CraneV10() {
//        // Non-canonical record constructor must delegate to another constructor.
//        numberEggs = 10;
//        name = "dummy";
//    }
//
//    public CraneV10(int numberEggs) {
//        // Non-canonical record constructor must delegate to another constructor.
//        this.numberEggs = numberEggs;
//        name = "dummy";
//    }
//
//    public CraneV10(String name, int numberEggs) {
//        // Non-canonical record constructor must delegate to another constructor.
//        this.name = name;
//        this.numberEggs = numberEggs;
//    }

}

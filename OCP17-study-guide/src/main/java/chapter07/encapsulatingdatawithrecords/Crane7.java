package chapter07.encapsulatingdatawithrecords;

public record Crane7(int numberEggs, String name) {
    public Crane7(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }
}

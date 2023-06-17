package chapter07.encapsulating_data_with_records;

public record Crane7(int numberEggs, String name) {
    public Crane7(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }
}

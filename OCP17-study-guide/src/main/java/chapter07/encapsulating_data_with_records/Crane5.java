package chapter07.encapsulating_data_with_records;

public record Crane5(int numberEggs, String name) {
    public Crane5 {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
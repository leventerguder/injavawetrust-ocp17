package chapter07.encapsulating_data_with_records;

public record Crane4(int numberEggs, String name) {

    public Crane4 {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}

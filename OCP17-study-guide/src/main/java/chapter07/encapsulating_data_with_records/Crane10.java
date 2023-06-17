package chapter07.encapsulating_data_with_records;

public record Crane10(int numberEggs, String name) {
    @Override
    public int numberEggs() {
        return 10;
    }

    @Override
    public String toString() {
        return name;
    }
}
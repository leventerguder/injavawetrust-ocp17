package chapter07.encapsulatingdatawithrecords;

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
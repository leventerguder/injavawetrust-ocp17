package chapter07.encapsulatingdatawithrecords;

public record Crane4(int numberEggs, String name) {

    public Crane4 {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}

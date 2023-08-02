package chapter07.encapsulating_data_with_records;

public record CraneV5(int numberEggs, String name) {

    public CraneV5(int numberEggs, String name) {
        if (numberEggs < 0)
            throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

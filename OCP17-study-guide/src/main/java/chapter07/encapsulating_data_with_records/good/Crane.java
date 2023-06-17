package chapter07.encapsulating_data_with_records.good;

public final class Crane {
    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition

        else throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}
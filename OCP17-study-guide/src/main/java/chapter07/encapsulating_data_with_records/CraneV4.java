package chapter07.encapsulating_data_with_records;

public record CraneV4(int numberEggs, String name) implements Bird {
    @Override
    public void fly() {
        System.out.println("Crane Flying...");
    }
}


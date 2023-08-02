package chapter07.encapsulating_data_with_records;

public record CraneV7(int numberEggs, String name) {

    public CraneV7 {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();

        System.out.println("compact constructor invoked!");
    }
}

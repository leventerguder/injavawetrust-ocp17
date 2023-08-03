package chapter07.encapsulating_data_with_records;

public record CraneV8(int numberEggs, String name) {
    public CraneV8 {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("CraneV8 - compact constructor invoked...");
    }
}
package chapter07.encapsulating_data_with_records;

public record CraneV14(int numberEggs, String name) {
    private static int type = 10;
    // public int size; // DOES NOT COMPILE
    // private boolean friendly; // DOES NOT COMPILE

    // While you can add methods, static fields, and other data types,
    // you cannot add instance fields outside the record declaration, even if they are private

    // private final boolean friendly = true; // DOES NOT COMPILE

    public void sampleMethod() {
        System.out.println("instance method...");
    }

    public static void sampleStaticMethod() {
        System.out.println("static method...");
    }

    class Nested {

    }

    enum NestedEnum {
        ON, OFF
    }

    private sealed class SuperClass {

    }

    private final class SubClass extends SuperClass {

    }
}
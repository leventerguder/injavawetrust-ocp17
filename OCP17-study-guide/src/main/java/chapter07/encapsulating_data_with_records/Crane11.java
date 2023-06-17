package chapter07.encapsulating_data_with_records;

public record Crane11(int numberEggs, String name) {
    private static int type = 10;
    // public int size; // DOES NOT COMPILE
    // private boolean friendly; // DOES NOT COMPILE

    // While you can add methods, static fields, and other data types,
    // you cannot add instance fields outside the record declaration, even if they are private
}
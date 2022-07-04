package chapter07.encapsulatingdatawithrecords;

public record Crane12(int numberEggs, String name) {

    // Records also do not support instance initializers.
    //    {
    //        System.out.println("DOES NOT COMPILE");
    //    }

    static {
        System.out.println("This is a static initializer...");
    }
}

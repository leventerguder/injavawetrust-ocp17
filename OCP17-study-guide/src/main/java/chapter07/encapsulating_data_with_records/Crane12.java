package chapter07.encapsulating_data_with_records;

public record Crane12(int numberEggs, String name) {

    // Records also do not support instance initializers.
    //    {
    //        System.out.println("DOES NOT COMPILE");
    //    }

    static {
        System.out.println("This is a static initializer...");
    }
}

package chapter08.coding_functional_interfaces;

public interface SoarInvalidToString {

    // int toString(); // DOES NOT COMPILE

    /*
    Since Java assumes all classes extend from Object,
    you also cannot declare an interface method that is incompatible with Object
     */
}

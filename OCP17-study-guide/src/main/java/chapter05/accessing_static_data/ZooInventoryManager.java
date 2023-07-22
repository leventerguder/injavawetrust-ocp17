package chapter05.accessing_static_data;

public class ZooInventoryManager {

    private static final String[] treats = new String[10];

    public static void main(String[] args) {
        treats[0] = "popcorn";
        treats[0] = "popcorn-v2";
        treats[1] = "popcorn-v3";

        // treats = null; // DOES NOT COMPILE
        // treats =  new String[4]; // DOES NOT COMPILE

        // It actually does compile since treats is a reference variable.
        // We are allowed to modify the referenced object or array’s contents.
        // All the compiler can do is check that we don’t try to reassign treats to point to a different object.

        // We try to reassign;
        // treats =  new String[5]; // DOES NOT COMPILE
    }
}

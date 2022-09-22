package chapter01.understanding_data_types;

public class DistinguishingPrimitiveAndReferenceTypes {

    public static void main(String[] args) {

        String reference = "hello";
        int len = reference.length();
        //int bad = len.length(); // DOES NOT COMPILE
        //Primitives do not have methods.

        // Primitive types will give you a compiler error if you attempt to assign them null
        // int value = null; // DOES NOT COMPILE
        String name = null;
    }
}

package chapter04.understanding_arrays;

public class CreatingAnArrayWithReferenceVariablesCasting {

    public static void main(String[] args) {

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder(); // Careful! The code throws an ArrayStoreException.
    }
}

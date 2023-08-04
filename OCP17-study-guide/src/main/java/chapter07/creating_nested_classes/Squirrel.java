package chapter07.creating_nested_classes;

public class Squirrel {

    public void visitFox() {
        // new Den(); // DOES NOT COMPILE

        // new Fox().new Den(); // DOES NOT COMPILE, Den is private!
    }
}

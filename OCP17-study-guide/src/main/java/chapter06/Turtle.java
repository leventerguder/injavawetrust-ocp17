package chapter06;

public class Turtle {

    /*
    A class can have multiple constructors, as long as each constructor has a unique constructor signature. In this case,
    that means the constructor parameters must be distinct. Like methods with the same name but different signatures,
    declaring multiple constructors with different signatures is referred to as constructor overloading.
     */
    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }
}

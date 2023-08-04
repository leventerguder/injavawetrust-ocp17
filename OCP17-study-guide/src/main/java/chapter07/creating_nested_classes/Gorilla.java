package chapter07.creating_nested_classes;


public class Gorilla {

    interface Climb {
    }

    protected Climb climbing = new Climb() {
    };

    private Climb climbing2 = new Climb() {
    };

    Nested nestedVar = new Nested();
    class Nested {
    }

    Nested nestedVar2 = new Nested();

    void method() {
        System.out.println(climbing.getClass());
        System.out.println(climbing2.getClass());
        System.out.println(nestedVar.getClass());
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.method();
    }
}
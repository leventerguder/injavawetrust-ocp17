package chapter06.inheritingmembers;

public class RhinocerosBeetle extends Beetle {
    private int getSize() {
        return 5;
    }

    /*
    Notice that the return type differs in the child method from String to int.
    In this example, the method getSize() in the parent class is redeclared,
    so the method in the child class is a new method and not an override of the method in the parent class.
    */
}

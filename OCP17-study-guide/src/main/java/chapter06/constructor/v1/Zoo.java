package chapter06.constructor.v1;

public class Zoo {
    // Since super() can only be called once as the first statement of the constructor, the code will not compile.
    public Zoo() {
        super();
        System.out.println("Zoo created");
        // super(); // DOES NOT COMPILE
    }
}
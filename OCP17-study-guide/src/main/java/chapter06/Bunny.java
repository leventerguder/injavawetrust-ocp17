package chapter06;

public class Bunny {


    /*
    The name of the constructor, Bunny, matches the name of the class, Bunny, and there is no return type, not even void.
    That makes this a constructor.
     */
    public Bunny() {
        System.out.print("hop");
    }

    /*
    Java is case-sensitive. Since it doesn’t match, Java knows it can’t be a constructor and
    is supposed to be a regular method. However, it is missing the return type and doesn’t compile.
     */
    // public bunny() { } // DOES NOT COMPILE

    // Perfectly good method but is not a constructor because it has a return type.
    public void Bunny() {
    }
}

package chapter07.creating_nested_classes;

public class Fox {

    private class Den {
    }

    public void goHome() {
        new Den();
    }

    public static void visitFriend() {
        //    new Den(); // DOES NOT COMPILE
        // new Fox().new Den();
    }
// The first constructor call compiles because goHome() is an instance method, and therefore the call is associated with
// the this instance.The second call does not compile because it is called inside a static method.
}

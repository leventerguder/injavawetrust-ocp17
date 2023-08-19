package chapter08.questions.q14;

public class Q14 {

    public static void main(String[] args) {

        // A. (Wolf w, var c) -> 39  // DOES NOT COMPILE
        // B. (final Camel c) -> {}  // VALID
        // C. (a,b,c) -> {int b = 3; return 2;} // DOES NOT COMPILE
        // D. (x,y) -> new RuntimeException()
        // E. (var y) -> return 0; // DOES NOT COMPILE
        // F. () -> {float r} // VALID
        // G. (Cat a, b) -> {} // DOES NOT COMPILE
    }
}

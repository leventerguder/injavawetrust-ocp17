package chapter05.questions.q01;

public class Q01 {

//    Which statements about the final modifier are correct? (Choose all that apply.)
//++    A. Instance and static variables can be marked final.
//    B. A variable is effectively final only if it is marked final.
//    C. An object that is marked final cannot be modified.
//    D. Local variables cannot be declared with type var and the final modifier.
//++    E. A primitive that is marked final cannot be modified

    public static final int CONSTANT = 100;
    private final int instanceVariable = 10;

    void method() {
        final var localVar = 10;
        int effectivelyFinal = 15;
        int notEffectivelyFinal = 10;
        notEffectivelyFinal = 20;
    }
}

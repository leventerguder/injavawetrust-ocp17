package chapter10.questions.q20;

import java.util.Optional;

public class Q20 {

    public static void main(String[] args) {


//        Which of the following throw an exception when an Optional is empty? (Choose all
//        that apply.)

//        A. opt.orElse("");
//        B. opt.orElseGet(() -> "");
// ++       C. opt.orElseThrow();
//        D. opt.orElseThrow(() -> throw new Exception());
// ++       E. opt.orElseThrow(RuntimeException::new);
// ++      F. opt.get();
//        G. opt.get("");
    }

    private static void optionA() {
        Optional<String> opt = Optional.empty();
        opt.orElse("");
    }

    private static void optionB() {
        Optional<String> opt = Optional.empty();
        opt.orElseGet(() -> "");
    }

    private static void optionC() {
        Optional<String> opt = Optional.empty();
        opt.orElseThrow();
    }

    private static void optionD() {
        Optional<String> opt = Optional.empty();
        // opt.orElseThrow(() -> throw new Exception()); // DOES NOT COMPILE
    }

    private static void optionE() {
        Optional<String> opt = Optional.empty();
        opt.orElseThrow(RuntimeException::new);
    }

    private static void optionF() {
        Optional<String> opt = Optional.empty();
        opt.get();
    }

    private static void optionG() {
        Optional<String> opt = Optional.empty();
        // opt.get(""); // DOES NOT COMPILE
    }
}

package chapter13.questions.q18;

import java.util.concurrent.Callable;

public class Q18 {

    public static void main(String[] args) {

//        Callable optionA = a -> {
//            return 10;
//        };

//        Callable optionB = () -> {
//            String s = "";
//        };

        Callable optionC = () -> 5;

//        Callable optionD = () -> {
//            return null
//        };

        Callable optionE = () -> "The" + "Zoo";


//        Callable optionF = (int count) -> count + 1;

        Callable optionG = () -> {
            System.out.println("Giraffe");
            return 10;
        };
    }
}

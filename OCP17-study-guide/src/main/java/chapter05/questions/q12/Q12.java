package chapter05.questions.q12;

public class Q12 {

    public void feed() {
        int monkey = 0;
        if (monkey > 0) {
            var giraffe = monkey++; // giraffe , effectively final
            String name; //effectively final
            name = "geoffrey";
        }
        String name = "milly";
        var food = 10;
        while (monkey <= 10) {
            food = 0;
        }
        name = null;
    }
}

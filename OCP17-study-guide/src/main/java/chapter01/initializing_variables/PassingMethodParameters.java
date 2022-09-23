package chapter01.initializing_variables;

public class PassingMethodParameters {

    public void findAnswer(boolean check) {
    }

    // The call to findAnswer() does not compile because it tries to use a variable that is not initialized.
    public void checkAnswer() {
        boolean value;
        //   findAnswer(value); // DOES NOT COMPILE
    }

}

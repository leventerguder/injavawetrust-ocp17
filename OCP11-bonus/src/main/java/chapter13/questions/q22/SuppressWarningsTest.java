package chapter13.questions.q22;

public class SuppressWarningsTest {

    @SuppressWarnings("deprecation")
    public void call() {
        DeprecatedWarnings.method();
    }

    public void callWithoutSuppressWarning() {
        DeprecatedWarnings.method();
    }
}

package chapter13.using_common_annotations.example05;

public class NeverDoThisV3 {

    // @SafeVarargs // DOES NOT COMPILE
    public static void eat(int meal) {
    }

    // @SafeVarargs // DOES NOT COMPILE
    protected void drink(String... cup) {
    }

    // @SafeVarargs // DOES NOT COMPILE
    void chew(boolean... food) {
    }
}

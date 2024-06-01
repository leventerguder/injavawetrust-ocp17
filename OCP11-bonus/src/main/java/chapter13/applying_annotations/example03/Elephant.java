package chapter13.applying_annotations.example03;

public abstract class Elephant {
    @Injured("Legs")
    public void fallDown() {
    }

    @Injured(value = "Legs")
    public abstract int trip();

    // The usage in the first two annotations are equivalent, as the compiler will convert the shorthand form to
    // the long form with the value() element name.

    @Injured
    String injuries[];

    // The last annotation with no values is permitted because @Injured does not have any required elements.
}
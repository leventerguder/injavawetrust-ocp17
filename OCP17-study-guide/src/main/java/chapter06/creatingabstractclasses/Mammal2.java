package chapter06.creatingabstractclasses;

public abstract class Mammal2 {
    abstract CharSequence chew();

    public Mammal2() {
        System.out.println(chew()); // Does this line compile?
    }
}

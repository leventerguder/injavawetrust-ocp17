package chapter06.creating_abstract_classes;

public abstract class Mammal2 {
    abstract CharSequence chew();

    public Mammal2() {
        System.out.println(chew()); // Does this line compile?
    }
}

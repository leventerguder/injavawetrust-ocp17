package chapter13.declaring_annotation_specific_annotations.example03;


public class RetentionOverride {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.walk();
    }
}

class Animal {
    void walk() {
        System.out.println("animal walk");
    }
}

class Cat extends Animal {

    @Override
        // The @Override annotation has RetentionPolicy.SOURCE.
        // Check compiled classes(target), there won't be @Override annotation.

    void walk() {
        System.out.println("cat walk");
    }
}
//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.SOURCE)
//public @interface Override {
//}

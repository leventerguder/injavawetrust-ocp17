package chapter06.creating_abstract_classes;

public abstract class Turtle {

//    public abstract long eat()  // DOES NOT COMPILE
//    public abstract void swim() {}; // DOES NOT COMPILE
//    public abstract int getAge() { //  DOES NOT COMPILE
//        return 10;
//    }
//
//    public abstract void sleep; // DOES NOT COMPILE
//    public void goInShell(); // DOES NOT COMPILE

    /*
    - The first method, eat(), does not compile because it is marked abstract but does not end with a semicolon (;).
    - The next two methods, swim() and getAge(), do not compile because they are marked abstract, but they provide an
      implementation block enclosed in braces ({})
    - For the exam, remember that an abstract method declaration must end in a semicolon without any braces.
    - The next method, sleep, does not compile because it is missing parentheses, (), for method arguments.
    - The last method, goInShell(), does not compile because it is not marked abstract and therefore must provide a body
      enclosed in braces.
     */
}

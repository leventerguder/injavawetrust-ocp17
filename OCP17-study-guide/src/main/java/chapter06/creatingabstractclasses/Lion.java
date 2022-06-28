package chapter06.creatingabstractclasses;

public class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
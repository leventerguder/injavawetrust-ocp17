package chapter06.inheriting_members;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }

    public static void main(String[] args) {
        eat();
    }
}
package chapter05.designing_methods;

public class ReturnType {

    public static void main(String[] args) {
        swim(-10);
        swim(-20);
        swim(20);
    }

    public static void swim(int distance) {
        if (distance <= 0) {
            // Exit early, nothing to do!
            return;
        }
        System.out.print("Fish is swimming " + distance + " meters");
    }
}

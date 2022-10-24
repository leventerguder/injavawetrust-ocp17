package chapter05.working_with_varargs;

public class DogWalker {

    public static void walkDog(int start, int... steps) {
        System.out.println("Start : " + start + " Steps : " + steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);
        walkDog(1, 2);
        walkDog(1, 2, 3);
        walkDog(1, new int[]{4, 5});

        walkDog(1, null); // Triggers NullPointerException in walkDog()
    }
}

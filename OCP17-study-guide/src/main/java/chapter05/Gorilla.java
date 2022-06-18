package chapter05;

public class Gorilla {

    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        // babyGorilla(); // DOES NOT COMPILE
        // Doesn’t compile because a static method cannot call an instance method.
    }

    public int total;

    //public static double average = total / count; // DOES NOT COMPILE
    // doesn’t compile because a static variable is trying to use an insta

}

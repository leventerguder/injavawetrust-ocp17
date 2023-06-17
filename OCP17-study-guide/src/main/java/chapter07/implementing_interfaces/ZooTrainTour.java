package chapter07.implementing_interfaces;

public interface ZooTrainTour {

    abstract int getTrainName();

    private static void ride() {
    }

    default void playHorn() {
        getTrainName();
        ride();
    }

    // The slowDown() method is static, though, and cannot call a default or private method, such as playHorn(),
    // without an explicit reference object

//    public static void slowDown() {
//        playHorn(); // DOES NOT COMPILE
//    }

    static void speedUp() {
        ride();
    }
}

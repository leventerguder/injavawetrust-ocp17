package chapter07.implementing_interfaces;

public interface Schedule {

    default void wakeUp() {
        checkTime(7);
    }

    private void haveBreakfast() {
        checkTime(9);
    }

    static void workOut() {
        checkTime(18);
    }

    private static void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have " + (17 - hour) + " hours left "
                    + "to make the appointment");
        }
    }
}


package chapter02.applying_unary_operators;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1

        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0

        // For the exam, it is critical that you know the difference between
        // expressions like parkAttendance++ and ++parkAttendance.
    }
}

package chapter02;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1

        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0
    }
}

package chapter05;

public class PassByValue {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.print(num); // 4
    }

    public static void newNumber(int num) {
        num = 8;
    }
}

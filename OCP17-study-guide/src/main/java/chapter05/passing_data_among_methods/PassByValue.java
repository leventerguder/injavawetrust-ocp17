package chapter05.passing_data_among_methods;

public class PassByValue {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.print(num); // 4
    }

    public static void newNumber(int num) {
        System.out.println("num before assignment : " + num);
        num = 8;
        System.out.println("num after assignment : " + num);
    }
}

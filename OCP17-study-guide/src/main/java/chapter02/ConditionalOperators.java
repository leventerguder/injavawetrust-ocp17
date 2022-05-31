package chapter02;

public class ConditionalOperators {

    public static void main(String[] args) {

        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen); // true
    }
}

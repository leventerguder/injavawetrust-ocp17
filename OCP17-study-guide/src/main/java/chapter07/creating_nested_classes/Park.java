package chapter07.creating_nested_classes;

public class Park {

    static class Ride {
        private int price = 6;
    }

    public static void main(String[] args) {

        var ride = new Ride();
        System.out.println(ride.price);
    }
}

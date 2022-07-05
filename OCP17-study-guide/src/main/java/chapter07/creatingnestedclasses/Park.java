package chapter07.creatingnestedclasses;

public class Park {

    static class Ride {
        private int price = 6;
    }

    public static void main(String[] args) {

        var ride = new Ride();
        System.out.println(ride.price);
    }
}

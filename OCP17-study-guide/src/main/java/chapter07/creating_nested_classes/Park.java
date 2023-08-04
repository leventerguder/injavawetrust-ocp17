package chapter07.creating_nested_classes;

public class Park {

    static class Ride {
        private int price = 6;

        private static final int MAX_SPEED = 100;

        private void innerMethod() {
            System.out.println("innerMethod!");
        }

        private static void innerStaticMethod() {
            System.out.println("innerStaticMethod!");
        }
    }

    private void outerMethod() {
        //Ride.innerMethod();
        var ride = new Ride();
        ride.innerMethod();

        Ride.innerStaticMethod();
        ride.innerStaticMethod();
    }

    public static void main(String[] args) {

        var ride = new Ride();
        System.out.println(ride.price);
        System.out.println(Ride.MAX_SPEED);
    }
}

package chapter05.overloading_methods;

public class Kiwi2 {

    public void fly(long numMiles) {
        System.out.println("long");
    }

    public void fly(Integer numMiles) {
        System.out.println("Integer");
    }

    public void fly(Object numMiles) {
        System.out.println("Object");
    }


    public static void main(String[] args) {
        Kiwi2 kiwi = new Kiwi2();
        kiwi.fly(10);
        kiwi.fly((Integer) 10);
        kiwi.fly((long) 10);
        // kiwi.fly((Long) 10);
        kiwi.fly((Object) 10);
    }

}
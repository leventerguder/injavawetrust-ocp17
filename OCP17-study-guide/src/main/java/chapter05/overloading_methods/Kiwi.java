package chapter05.overloading_methods;

public class Kiwi {

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(Integer numMiles) {
        System.out.println("Integer");
    }


    public static void main(String[] args) {
        Kiwi kiwi = new Kiwi();
        kiwi.fly(10);
        kiwi.fly((Integer) 10);
        kiwi.fly(Integer.valueOf(10));
    }

}
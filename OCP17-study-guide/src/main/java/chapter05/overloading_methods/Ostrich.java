package chapter05.overloading_methods;

public class Ostrich {

    public void fly(int i) {
        System.out.print("int");
    }

    public void fly(long l) {
        System.out.print("long");
    }


    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}

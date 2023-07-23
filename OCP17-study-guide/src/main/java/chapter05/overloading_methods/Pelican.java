package chapter05.overloading_methods;

public class Pelican {

    public void fly(String s) {
        System.out.print("string");
    }

    public void fly(Object o) {
        System.out.print("object");
    }
//    public void fly(Integer o) {
//        System.out.print("integer");
//    }
//    public void fly(int o) {
//        System.out.print("int");
//    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test");
        System.out.print("-");
        p.fly(56);
    }
}

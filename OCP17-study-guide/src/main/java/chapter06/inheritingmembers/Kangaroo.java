package chapter06.inheritingmembers;

/*
When you override a method, you may still reference the parent version of the method using the super keyword.
In this manner, the keywords this and super allow you to select between the current and parent versions of a method, respectively.
 */

public class Kangaroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight()); // 50.0
        System.out.println(new Kangaroo().getAverageWeight()); // 70.0
    }

}

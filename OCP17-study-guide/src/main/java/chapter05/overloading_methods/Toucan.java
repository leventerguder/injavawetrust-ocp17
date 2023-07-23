package chapter05.overloading_methods;

public class Toucan {

    public void fly(int[] lengths) {
    }

    //public void fly(int... lengths) {} // DOES NOT COMPILE

    public void flyV2(int... lengths) {
    } // DOES NOT COMPILE

    public static void main(String[] args) {
        Toucan toucan = new Toucan();
        toucan.fly(new int[]{1, 2, 3});
        toucan.flyV2(1, 2, 3);

    }
}

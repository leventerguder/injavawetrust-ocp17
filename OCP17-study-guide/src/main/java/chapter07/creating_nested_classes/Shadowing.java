package chapter07.creating_nested_classes;

public class Shadowing {
    String shadowing = "I am instance variable";

    public static void main(String[] args) {
        Shadowing st = new Shadowing();
        st.shadowingTest();
    }

    void shadowingTest() {
        String shadowing = "I am local variable";

        System.out.println(shadowing);
        System.out.println(this.shadowing);
    }
}

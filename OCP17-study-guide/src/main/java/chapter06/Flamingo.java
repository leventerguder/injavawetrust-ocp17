package chapter06;

public class Flamingo {
    private String color = null;

    public void setColor(String color) {
        color = color;

        // Java uses the most granular scope, so when it sees color = color,
        // it thinks you are assigning the method parameter value to itself (not the instance variable).


        // The fix when you have a local variable with the same name as an instance variable is to use the this reference or keyword.
        this.color = color; // Sets the instance variable with method parameter
    }

    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}

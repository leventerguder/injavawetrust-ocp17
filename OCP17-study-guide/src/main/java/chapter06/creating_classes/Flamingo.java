package chapter06.creating_classes;

public class Flamingo {
    private String color = null;

    public void setColor(String color) {
        color = color;

        // Java uses the most granular scope, so when it sees color = color,
        // it thinks you are assigning the method parameter value to itself (not the instance variable).
    }

    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}

package chapter06.creating_classes;

public class FlamingoV2 {
    private String color = null;

    public void setColor(String color) {

        // The fix when you have a local variable with the same name as an instance variable is to use the this reference or keyword.
        this.color = color; // Sets the instance variable with method parameter
    }

    public static void main(String... unused) {
        var f = new FlamingoV2();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}

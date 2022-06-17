package chapter05.pond.shore;

public class Bird {

    protected String text = "floating";

    protected void floatInWater() {
        System.out.println(text); // protected access is ok
    }
}

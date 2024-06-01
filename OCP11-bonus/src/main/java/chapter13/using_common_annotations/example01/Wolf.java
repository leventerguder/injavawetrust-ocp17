package chapter13.using_common_annotations.example01;

public class Wolf extends Canine {

    @Override
    public int cunning() {
        return Integer.MAX_VALUE;
    }

    @Override
    void howl() {
        System.out.print("Howl!");
    }
}

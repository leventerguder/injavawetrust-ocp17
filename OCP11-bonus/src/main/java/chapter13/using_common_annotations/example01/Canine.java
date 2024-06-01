package chapter13.using_common_annotations.example01;

public class Canine implements Intelligence {
    @Override
    public int cunning() {
        return 500;
    }

    void howl() {
        System.out.print("Woof!");
    }
}

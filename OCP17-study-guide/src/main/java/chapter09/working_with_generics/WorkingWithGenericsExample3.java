package chapter09.working_with_generics;

public class WorkingWithGenericsExample3 {

    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);
    }
}

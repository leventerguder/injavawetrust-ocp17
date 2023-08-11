package chapter08.writing_simple_lambdas;

public class CheckIfSwims implements CheckTrait {
    public boolean test(Animal a) {
        return a.canSwim();
    }
}

package chapter08.writing_simple_lambdas;

public class AssigningLambdasToVar {

    public static void main(String[] args) {


        // Cannot infer type: lambda expression requires an explicit target type
        // var invalid = (Animal a) -> a.canHop();

        CheckTrait checkTrait = (Animal a) -> a.canHop();

        AnotherTrait anotherTrait = (Animal a) -> a.canHop();

        AnotherTrait anotherTrait2 = a -> a.canHop();
    }
}

interface AnotherTrait {
    boolean method(Animal a);
}

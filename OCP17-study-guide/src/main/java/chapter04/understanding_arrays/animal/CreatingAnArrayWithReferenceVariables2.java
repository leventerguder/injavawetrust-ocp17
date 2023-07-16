package chapter04.understanding_arrays.animal;

public class CreatingAnArrayWithReferenceVariables2 {

    public static void main(String[] args) {

        Animal[] animals = new Dog[3];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();

        Dog[] dogs = (Dog[]) animals;

        animals[0] = new Bird(); // java.lang.ArrayStoreException
        animals[1] = new Cat(); // java.lang.ArrayStoreException

    }
}

package chapter05.passing_data_among_methods;

public class ReferenceTest {

    public static void main(String[] args) {


        Animal animal = new Animal("tekir");
        System.out.println(animal.getName());
        method(animal);
        System.out.println("after calling method...");
        System.out.println(animal.getName());

        System.out.println("after calling methodV2...");
        methodV2(animal);
        System.out.println(animal.getName());
    }

    static void method(Animal animal) {

        System.out.println("method...");
        System.out.println(animal.getName());
        animal = new Animal("pamuk");
        System.out.println(animal.getName());

    }

    static void methodV2(Animal animal) {

        System.out.println("methodV2...");
        animal.setName("boncuk");


    }

}

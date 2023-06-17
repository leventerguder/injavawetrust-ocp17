package chapter07.understanding_polymorphism;

public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        //     Bird bird = (Bird) fish; // DOES NOT COMPILE

//        if (fish instanceof Bird b) { // DOES NOT COMPILE
//            // Do stuff
//        }
    }

    // the classes Fish and Bird are not related through any class
    // hierarchy that the compiler is aware of; therefore, the code will not compile
}
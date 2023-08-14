package chapter08.using_method_reference;

public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        DuckHelper.teacher(sound, learner);

        LearnToSpeak learnerV2 = System.out::println;
        learnerV2.speak(sound);
    }

    public static void main(String[] args) {

        makeSound("Sound!");
    }
}

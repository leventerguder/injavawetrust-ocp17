package chapter05.declaring_local_and_instance_variables;

public class LocalVariableModifiers {

    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        else rest = 20;
        System.out.print(rest);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

        // rest = 10; // DOES NOT COMPILE
        // giraffe = new Animal(); // DOES NOT COMPILE
        // friends = null; // DOES NOT COMPILE

    }

    public void zooAnimalCheckup2(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        // System.out.print(rest); // DOES NOT COMPILE
    }

    public void zooAnimalCheckup() {
        final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];
        giraffe.setName("George");
        friends[2] = 2;
    }
}

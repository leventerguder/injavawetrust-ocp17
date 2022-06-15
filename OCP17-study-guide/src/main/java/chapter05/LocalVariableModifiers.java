package chapter05;

public class LocalVariableModifiers {


    /*
    The rest variable might not have been assigned a value, such as if isWeekend is false.
    Since the compiler does not allow the use of local variables that may not have been assigned a value,
     the code does not compile.
     */
    public void zooAnimalCheckup1(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        //  System.out.print(rest); // DOES NOT COMPILE
    }

    public void zooAnimalCheckup2(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        else rest = 20;

        System.out.print(rest);

        final int[] friends = new int[5];
        // rest = 10; // DOES NOT COMPILE
        // friends = null; // DOES NOT COMPILE
    }

    public void zooAnimalCheckup3() {
        final int rest = 5;
        //rest = 20; // DOES NOT COMPILE
        final int[] friends = new int[5];
        friends[2] = 2;
        friends[2] = 10;
    }
}

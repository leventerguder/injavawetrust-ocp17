package chapter04.understanding_arrays;

public class UsingAnArray {

    public static void main(String[] args) {

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        // System.out.println(mammals.length()); // DOES NOT COMPILE

        var birds = new String[6];
        System.out.println(birds.length); //6
        /*
        Even though all six elements of the array are null, there are still six of them.
        The length attribute does not consider what is in the array; it only considers how many slots have been allocated.
         */
    }
}

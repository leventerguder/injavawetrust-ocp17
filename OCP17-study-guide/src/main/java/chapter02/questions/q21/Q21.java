package chapter02.questions.q21;

public class Q21 {

    public static void main(String[] args) {

        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber;
        int plane = -myFavoriteNumber;
        var superman = bird == plane ? 5 : 10;
        System.out.println(bird + "," + plane + "," + --superman); // -9,-8,9

        /*
        The bitwise complement of 8 can be found by multiplying
        the number by negative one and subtracting one.
         */
        /*
        The pre-decrement operator takes superman, subtracts 1, and returns the new value, printing 9.
         */
    }
}

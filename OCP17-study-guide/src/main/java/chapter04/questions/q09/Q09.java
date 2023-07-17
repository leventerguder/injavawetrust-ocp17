package chapter04.questions.q09;

public class Q09 {

//    Which of the following are true about arrays? (Choose all that apply.)

// ++ A. The first element is index 0.
//    B. The first element is index 1.
//++  C. Arrays are fixed size.
//    D. Arrays are immutable.
//    E. Calling equals() on two different arrays containing the same primitive values always returns true.
//++  F. Calling equals() on two different arrays containing the same primitive values always returns false.
//    G. Calling equals() on two different arrays containing the same primitive values can return true or false.

    public static void main(String[] args) {

        int[] array1 = {1, 5, 6, 10};
        int[] array2 = {1, 5, 6, 10};

        System.out.println(array1[0]);

        array1[0] = 100;

        System.out.println(array1[0]);

        System.out.println(array1.equals(array2));
    }
}

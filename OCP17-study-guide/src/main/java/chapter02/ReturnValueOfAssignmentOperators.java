package chapter02;

public class ReturnValueOfAssignmentOperators {

    public static void main(String[] args) {

        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3

        // The key here is that (wolf=3) does two things. First, it sets the value of the variable wolf to be 3.
        // Second, it returns a value of the assignment, which is also 3.

        boolean healthy = false;
        if (healthy = true) // While this may look like a test if healthy is true, it’s actually assigning healthy a value of true.
            System.out.print("Good!");

    }
}

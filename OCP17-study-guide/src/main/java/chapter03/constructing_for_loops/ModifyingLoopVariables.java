package chapter03.constructing_for_loops;

public class ModifyingLoopVariables {

    public static void main(String[] args) {

        // As a general rule, it is considered a poor coding practice to modify loop variables due to
        // the unpredictability of the result, such as in the following examples:

        for (int i = 0; i < 10; i++)
            i = 0;

        for (int j = 1; j < 10; j++)
            j++;
    }
}

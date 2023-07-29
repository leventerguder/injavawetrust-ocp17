package chapter06.questions.q21;

import java.util.Arrays;

public class Q21 {

//    21. Which of the following are properties of immutable classes? (Choose all that apply.)
//    A. The class can contain setter methods, provided they are marked final.
//+++    B. The class must not be able to be extended outside the class declaration.
//    C. The class may not contain any instance variables.
//    D. The class must be marked static.
//    E. The class may not contain any static variables.
//    F. The class may only contain private constructors.
//++    G. The data for mutable instance variables may be read, provided they cannot be modified by the caller.

    public static void main(String[] args) {

        int[] array = {1, 5, 10};

        ImmutableV2 immutableV2 = new ImmutableV2(array);

        System.out.println(Arrays.toString(immutableV2.getNumbers()));

        array[0] = 10;
        array[1] = 20;

        System.out.println(Arrays.toString(immutableV2.getNumbers()));
    }
}

class MutableV1 {
    private String variable;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}

// static class Invalid {}

final class Immutable {
    private static final int SIZE = 100;

    private final int length;

    public Immutable(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}

final class ImmutableV2 {

    private final int[] numbers;

    public ImmutableV2(int[] numbers) {
        //this.numbers = numbers;
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public int[] getNumbers() {
        return numbers;
    }
}


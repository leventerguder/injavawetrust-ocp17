package chapter05.passing_data_among_methods;

public class WrapperComparison {

    public static void main(String[] args) {

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println("i1 == i2 : " + (i1 == i2));
        System.out.println("i1.equals(i2) : " + (i1.equals(i2)));

        Integer i3 = 1000;
        Integer i4 = 1000;

        System.out.println("i3 == i4 : " + (i3 == i4));
        System.out.println("i3.equals(i4) : " + (i3.equals(i4)));


        // When == is used to compare a primitive to a wrapper,
        // the wrapper will be unwrapped and the comparison
        // will be primitive to primitive.

        // -Djava.lang.Integer.IntegerCache.high=1000
    }
}

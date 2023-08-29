package chapter09.working_with_generics;

public class MultipleBoundsExample {

    public static void main(String[] args) {


        SuperBound superBound = new SuperBound();
        ChildBound childBound = new ChildBound();
        GoodChildBound goodChildBound = new GoodChildBound();

        // type(superBound); // DOES NOT COMPILE
        // type(childBound); // DOES NOT COMPILE
        type(goodChildBound);

        type2(superBound);
        type2(childBound);
        type2(goodChildBound);

    }

    public static <T extends SuperBound & MyInterface> T type(T t) {
        return t;
    }

    public static <T extends SuperBound> T type2(T t) {
        return t;
    }
}

interface MyInterface {

}


class SuperBound {

}

class ChildBound extends SuperBound {

}

class GoodChildBound extends ChildBound implements MyInterface {

}


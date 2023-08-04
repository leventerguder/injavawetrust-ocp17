package chapter07.creating_nested_classes;

public class OuterClass2 {

    private class Inner {

    }

    class SubInner extends Inner {

    }

    final class FinalInner {

    }

    // class CanNotExtendsFinalClass extends FinalInner {}

    class SubInner2 extends OuterClass2 {

    }

    abstract class AbstractInnerClass {
        abstract void sampleAbstractMethod();
    }

}
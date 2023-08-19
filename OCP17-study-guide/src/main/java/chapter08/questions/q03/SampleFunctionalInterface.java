package chapter08.questions.q03;

@FunctionalInterface
public interface SampleFunctionalInterface {
    void singleAbstractMethod();

    //A functional interface can contain default and private methods.

    default void sampleDefaultMethod() {
        System.out.println("sampleDefaultMethod");
    }

    private void samplePrivateMethod() {
        System.out.println("samplePrivateMethod");
    }

    @Override
    public boolean equals(Object ob);

    @Override
    public int hashCode();

    @Override
    public String toString();
}

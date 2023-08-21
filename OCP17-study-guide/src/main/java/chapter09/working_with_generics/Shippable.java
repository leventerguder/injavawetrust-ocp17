package chapter09.working_with_generics;

public interface Shippable<T> {
    void ship(T t);
}


class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {
    }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) {
    }
}

class ShippableCrate implements Shippable {
    public void ship(Object t) {
    }
}


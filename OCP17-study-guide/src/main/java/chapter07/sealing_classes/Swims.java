package chapter07.sealing_classes;

public sealed interface Swims permits Dive, Duck, Floats, Swan {
}

sealed interface Dive extends Swims {
}

sealed class SuperClass /*permits SubClass */ {
}

final class SubClass extends SuperClass implements Dive {
}

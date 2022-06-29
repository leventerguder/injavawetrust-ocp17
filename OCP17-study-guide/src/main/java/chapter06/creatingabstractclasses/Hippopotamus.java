package chapter06.creatingabstractclasses;

abstract class Hippopotamus {
    // abstract static void swim(); // DOES NOT COMPILE
}
/*
A static method can only be hidden, not overridden. It is defined as belonging to the class, not an instance of the
class. If a static method cannot be overridden, then it follows that it also cannot be marked abstract since it can
never be implemented.

 */
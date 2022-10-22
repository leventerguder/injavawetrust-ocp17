package chapter05.designing_methods;

public class BeachTrip {

    public void jog1() {}

    // The 2jog() method doesn’t compile because identifiers are not allowed to begin with numbers.
    // public void 2jog() {} // DOES NOT COMPILE

    // The jog3() method doesn’t compile because the method name is before the return type.
    // public jog3 void() {} // DOES NOT COMPILE

    public void Jog_$() {}

    // The _ method is not allowed since it consists of a single underscore
    // public _() {} // DOES NOT COMPILE

    //The final line of code doesn’t compile because the method name is missing.
    // public void() {} // DOES NOT COMPILE
}
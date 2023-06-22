package chapter01.initializing_variables;

import java.time.LocalDate;

public class VarReview {


    // Review of var Rules

    // 1- A var is used as a local variable in a constructor, method, or initializer block.
    // 2- A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
    // 3- A var is always initialized on the same line (or statement) where it is declared.
    // 4- The value of a var can change, but the type cannot.
    // 5- A var cannot be initialized with a null value without a type.
    // 6- A var is not permitted in a multiple-variable declaration.
    // 7- A var is a reserved type name but not a reserved word,
    // meaning it can be used as an identifier except as a class, interface, or enum name.


}

// A var is used as a local variable in a constructor, method, or initializer block.
class Example {

    public Example() {
        var number = 10;
    }

    private void method() {
        var name = "username";
    }

    {
        var initialized = true;
    }
}

// A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
class Example2 {

    // private void notValid(var notAllowedHere) {} // DOES NOT COMPILE


    // public Example2(var notAllowedHere) {} // DOES NOT COMPILE

    // private var instanceVariableAsVarNotAllowed; // DOES NOT COMPILE

    // private static var staticVariableAsVarNotAllowed; // DOES NOT COMPILE
}

// A var is always initialized on the same line (or statement) where it is declared.
class Example3 {

    void method() {
        var number = 10;

        var sum
                = 20;

        // var notValid; notValid =20; // DOES NOT COMPILE
        // var notValid2;
    }
}

// The value of a var can change, but the type cannot.

class Example4 {

    void method() {
        var number = 10;
        number = 20;
        number = 30;

        final var sum = 100;
        // sum = 150; // DOES NOT COMPILE, final variable

        var today = LocalDate.now();

        // today = LocalTime.now(); // DOES NOT COMPILE

        var str = new StringBuilder("example content");
        // str = "another content"; // DOES NOT COMPILE
    }
}

// A var cannot be initialized with a null value without a type.

class Example5 {

    void method() {

        // var object = null; // DOES NOT COMPILE

        var content = (String) null;

        // var invalid = (null)String; // DOES NOT COMPILE

        var size = 10;
        // size = null; DOES NOT COMPILE

        var age = (Integer) 50;
        age = null;

        var name = "username";
        name = null;
    }
}

// A var is not permitted in a multiple-variable declaration.
class Example6 {

    void method() {

        // var number = 100, size = 200; // DOES NOT COMPILE
        int number2 = 100, size2 = 200;

        // var number3 = 100, var size3 = 200; // DOES NOT COMPILE
        // int number4 = 100, int number4 = 200; // DOES NOT COMPILE
    }
}

// 7- A var is a reserved type name but not a reserved word,
// meaning it can be used as an identifier except as a class, interface, or enum name.

// 'var' is a restricted identifier and cannot be used for type declarations

//class var { // DOES NOT COMPILE
//
//    public var() {}
//
//    private void var() {}
//}

// interface var {} // DOES NOT COMPILE

// enum var {} // DOES NOT COMPILE
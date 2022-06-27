package chapter06.inheritingmembers;

public class SunBear extends Bear {

    // In this example, sneeze() is marked static in the parent class but not in the child class.
    // The compiler detects that you’re trying to override using an instance method.
    // However, sneeze() is a static method that should be hidden, causing the compiler to generate an error.

//    public void sneeze() { // DOES NOT COMPILE
//        System.out.println("Sun Bear sneezes quietly");
//    }

    // The second method, hibernate(), does not compile for the opposite reason.
    // The method is marked static in the child class but not in the parent class.

//    public static void hibernate() { // DOES NOT COMPILE
//        System.out.println("Sun Bear is going to sleep");
//    }

    // Finally, the laugh() method does not compile.
    // Even though both versions of the method are marked static,
    // the version in SunBear has a more restrictive access modifier than the one it inherits,
    // and it breaks the second rule for overriding methods.

//    protected static void laugh() { // DOES NOT COMPILE
//        System.out.println("Sun Bear is laughing");
//    }
    
}
package chapter01.understanding_package_declarations_and_imports;

//  The import statement doesn’t bring in child packages, fields, or methods;
//  it imports only classes directly under the package.

//import java.util.*;
//import java.util.concurrent.*;

// import java.util.concurrent.atomic.*;
// Only the last import allows the class to be recognized because child packages are not included with the first two.

import java.util.concurrent.atomic.AtomicInteger;

public class WildCardImport {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());
    }
}

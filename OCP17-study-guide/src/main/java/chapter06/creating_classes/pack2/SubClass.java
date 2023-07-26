package chapter06.creating_classes.pack2;

import chapter06.creating_classes.pack1.SuperClass;

public class SubClass extends SuperClass {

    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        subClass.method();
    }

    void method() {

        // System.out.println(privateVar); // DOES NOT COMPILE
        // System.out.println(packageLevelVar); // DOES NOT COMPILE
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}

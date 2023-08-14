package chapter08.using_method_reference;

public class CallingConstructors {

    public static void main(String[] args) {

        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake")); // false


        StringCopier methodRef2 = String::new;
        StringCopier lambda2 = x -> new String(x);

        var myString2 = methodRef2.copy("Zebra");
        System.out.println(myString2.equals("Zebra")); // true

        Constructor constructor = MyClassConstructor::new;

        Constructor2 constructor2 = MyClassConstructor::new;
    }
}

interface Constructor {

    MyClassConstructor method();
}

interface Constructor2 {

    MyClassConstructor method(int number);
}

class MyClassConstructor {

    MyClassConstructor() {

    }

    MyClassConstructor(int number) {
    }
}
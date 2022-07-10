package chapter08.usingmethodreference;

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
    }
}

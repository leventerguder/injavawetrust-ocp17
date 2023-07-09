package chapter03.questions.q08;

public class Q08 {

    void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.print("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.print("small int");
        }
//        else if (o instanceof Long bat || bat <= 20) {  // DOES NOT COMPILE
//            System.out.print("long");
//        }
//        default { // default cannot be used as part of an if/else statement. // DOES NOT COMPILE
//            System.out.print("unknown");
//        }
    }
}

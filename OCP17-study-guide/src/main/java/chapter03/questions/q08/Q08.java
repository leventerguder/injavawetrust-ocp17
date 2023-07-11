package chapter03.questions.q08;

public class Q08 {


    public static void main(String[] args) {

        printType(11);
    }

    private static void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.print("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.print("small int");
        }
//  Due to flow scoping, if s is not a Long, then bat is not in scope in the expression bat <= 20
//        else if (o instanceof Long bat || bat <= 20) {  // DOES NOT COMPILE
//            System.out.print("long");
//        }
//        default {  // default cannot be used as part of an if/else statement. // DOES NOT COMPILE
//            System.out.print("unknown");
//        }
    }
}

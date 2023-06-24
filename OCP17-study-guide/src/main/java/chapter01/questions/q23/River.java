//package chapter01.questions.q23;
//
//public class River {
//
//    int Depth = 1;
//    float temp = 50.0; // DOES NOT COMPILE
//
//    /*
//    The variable temp is declared as a float, but the assigned value is 50.0,
//    which is a double without the F/f postfix.
//     */
//    public void flow() {
//        for (int i = 0; i < 1; i++) {
//            int depth = 2;
//            depth++;
//            temp--;
//        }
//        System.out.println(depth);
//        // The depth is declared inside the for loop and //only has scope inside this loop.
//        System.out.println(temp);
//    }
//
//
//    public static void main(String[] args) {
//        new River().flow();
//    }
//}

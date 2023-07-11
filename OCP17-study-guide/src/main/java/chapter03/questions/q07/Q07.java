package chapter03.questions.q07;

public class Q07 {

    public static void main(String[] args) {

        int[] array = {1, 5, 20, 3};

        print2(array);
        System.out.println();

        print4(array);
        System.out.println();

        print6(array);

    }

//    private static void print1(int[] weather) {
//        for (int i = weather.length; i > 0; i--) { // java.lang.ArrayIndexOutOfBoundsException
//            System.out.println(weather[i]);
//        }
//    }

    private static void print2(int[] weather) {
        for (int i = 0; i <= weather.length - 1; ++i) {
            System.out.println(weather[i]);
        }
    }

    private static void print3(int[] weather) {
        for (var w : weather) {
            // System.out.println(weather[i]); // DOES NOT COMPILE
        }
    }

    private static void print4(int[] weather) {
        for (int i = weather.length - 1; i >= 0; i--) {
            System.out.println(weather[i]);
        }
    }

//    private static void print5(int[] weather) {
//        for (int i = 0, int j = 3;i < weather.length; ++i){
//            // the data type must be listed only once, such as in for(int i=0, j=3; ...)
//            System.out.println(weather[i]);
//        }
//    }

    private static void print6(int[] weather) {
        for (int i = 0; ++i < 10 && i < weather.length; ) {
            //the first element of the array is skipped.
            System.out.println(weather[i]);
        }
    }
}

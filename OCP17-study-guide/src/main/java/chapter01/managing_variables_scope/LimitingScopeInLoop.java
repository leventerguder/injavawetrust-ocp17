package chapter01.managing_variables_scope;

public class LimitingScopeInLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // DOES NOT COMPILE

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
            // ...
            int sum = 20;
            //...
        }
        //System.out.println(sum); // DOES NOT COMPILE

//        int k = 0;
//        do {
//            int m = 5;
//            k++;
//            //...
//        } while (k < 10 && m < 10); // DOES NOT COMPILE


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = -1;

//        for (int i = 0; i < 10; i++) { //DOES NOT COMPILE
//            System.out.println(i);
//        }
    }
}

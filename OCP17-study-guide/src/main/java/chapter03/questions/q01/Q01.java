package chapter03.questions.q01;

public class Q01 {

//    Which of the following data types can be used in a switch expression? (Choose all that apply.)

//++    A. enum
//++    B. int
//++    C. Byte
//    D. long
//++    E. String
//++    F. char
//++    G. var
//    H. double

    void method1() {

        Season season = Season.SPRING;

        switch (season) {
        }

        int i = 10;
        switch (i) {
        }

        Byte b = 10;
        switch (b) {

        }

        long l = 10;
//        switch (l) {
//        } // DOES NOT COMPILE


        String s = "";
        switch (s) {
        }

        char c = 'a';
        switch (c) {
        }

        var v = 100;
        switch (v) {
        }

        double d = 10;
//        switch (d) {
//        } // DOES NOT COMPILE

    }
}

enum Season {
    WINTER, SPRING, SUMMER, FALL
}
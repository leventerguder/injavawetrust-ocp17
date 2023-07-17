package chapter04.questions.q02;

public class Q02 {

//    Which of these array declarations are not legal? (Choose all that apply.)
//
//    A. int[][] scores = new int[5][];
//    B. Object[][][] cubbies = new Object[3][0][5];
//+++    C. String beans[] = new beans[6];
//    D. java.util.Date[] dates[] = new java.util.Date[2][];
//+++    E. int[][] types = new int[];
//+++    F. int[][] java = new int[][];

    public static void main(String[] args) {

        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        // String beans[] = new beans[6]; // DOES NOT COMPILE
        java.util.Date[] dates[] = new java.util.Date[2][];
        // int[][] types = new int[]; // DOES NOT COMPILE
        // int[][] java = new int[][]; // DOES NOT COMPILE
    }
}

class beans {
}
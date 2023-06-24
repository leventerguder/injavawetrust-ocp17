package chapter01.questions.q10;

public class Q10 {


    public void printMagicData1() {
        var magic = 3_1;
        System.out.println(magic);
    }

    public void printMagicData2() {
        // var magic = 1_329_.0; // DOES NOT COMPILE
        // System.out.println(magic);
    }

    public void printMagicData3() {
        // var magic = 3_13.0_; // DOES NOT COMPILE
        // System.out.println(magic);
    }

    public void printMagicData4() {
        // var magic = 5_291._2; // DOES NOT COMPILE
        // System.out.println(magic);
    }

    public void printMagicData5() {
        var magic = 2_234.0_0;
        System.out.println(magic);
    }

    public void printMagicData6() {
        var magic = 9___6;
        System.out.println(magic);
    }

    public void printMagicData7() {
        // var magic = _1_3_5_0; // DOES NOT COMPILE
        // System.out.println(magic);
    }
}

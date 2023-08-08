package chapter07.questions.q07;

public interface Aquatic {

    int getNumOfGills(int p);
}

//public class ClownFish implements Aquatic {
//
//    String getNumOfGills() {
//        return "14";
//    }
//
//    int getNumOfGills(int input) { // DOES NOT COMPILE! , Not public!
//        return 15;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new ClownFish().getNumOfGills(-1))
//    }
//}
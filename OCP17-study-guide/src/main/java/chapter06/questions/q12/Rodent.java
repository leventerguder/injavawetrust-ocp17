package chapter06.questions.q12;

public class Rodent {
    public Rodent(Integer x) {
    }

    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

//class Beaver extends Rodent { // DOES NOT COMPILE
//    public Number chew() throws RuntimeException { //DOES NOT COMPILE
//        System.out.println("Beaver is chewing on wood");
//        return 2;
//    }
//}
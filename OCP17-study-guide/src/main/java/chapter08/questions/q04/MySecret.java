package chapter08.questions.q04;

public class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }


    public static void main(String[] args) {

        Secret lambda1 = (e) -> "Proof";
        // Secret lambda2 = (e) -> {"Proof"};
        // Secret lambda3 = (e)->{String e="";"Poof"};
        // Secret lambda4 = (e)->{String e="";return"Poof";};
        // Secret lambda5 = (e)->{String e="";return"Poof"};
        Secret lambda6 = (e)->{String f="";return"Poof";};
    }
}

interface Secret {
    String magic(double d);
}
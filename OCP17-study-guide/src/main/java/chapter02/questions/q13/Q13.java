package chapter02.questions.q13;

public class Q13 {

    public static void main(String[] args) {

        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);
        System.out.println(goingToTheStore + "-" + goingToTheZoo
                + "-" + stayingHome);

        // https://www.selikoff.net/ocp17/
        // Errata 915
    }
}

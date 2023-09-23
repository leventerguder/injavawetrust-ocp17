package chapter11.questions.q14;

public class Q14 {

    public static void main(String[] args) {

        var huey = (String) null;
        Integer dewey = null;
        Object louie = null;
        if (louie == huey.substring(dewey.intValue())) {
            System.out.println("Quack!");
        }
    }
}

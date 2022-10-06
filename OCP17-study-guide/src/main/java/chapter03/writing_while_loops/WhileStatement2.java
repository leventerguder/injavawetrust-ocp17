package chapter03.writing_while_loops;

public class WhileStatement2 {


    public static void main(String[] args) {

        WhileStatement2 statement = new WhileStatement2();
        statement.eatCheese(10);
    }

    int roomInBelly = 5;

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }
}

package chapter03.controlling_flow_with_branching;

public class NestedLoops2 {

    public static void main(String[] args) {

        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", ");
        }
    }
}

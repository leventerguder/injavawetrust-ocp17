package chapter03.constructing_for_loops;

public class ForStatement {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
        //System.out.println(i); // DOES NOT COMPILE

        int i;
        for (i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
        System.out.println(i);


    }
}

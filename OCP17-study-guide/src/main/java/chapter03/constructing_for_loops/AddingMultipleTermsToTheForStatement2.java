package chapter03.constructing_for_loops;

public class AddingMultipleTermsToTheForStatement2 {

    public static void main(String[] args) {

        for (int x = 0, y = 5; ((x < 5 && y > 3) | x == 1); x++) {

            System.out.println("x: " + x);
            System.out.println("y :" + y);
            y--;
        }

//        for(int x=1,y=5; (x>5),(y<3); x++ ) { // DOES NOT COMPILE
//
//        }
    }
}

package chapter01.managing_variables_scope;

public class LimitingScope {

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            System.out.println(bitesOfCheese);
        } // bitesOfCheese goes out of scope here

        //System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
                System.out.println(teenyBit);
            }
            // System.out.println(teenyBit); // DOES NOT COMPILE
        }
         // System.out.println(teenyBit); // DOES NOT COMPILE
    }

}

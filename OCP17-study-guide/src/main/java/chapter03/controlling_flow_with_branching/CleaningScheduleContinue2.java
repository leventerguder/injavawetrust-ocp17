package chapter03.controlling_flow_with_branching;

public class CleaningScheduleContinue2 {

    public static void main(String[] args) {

        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }
    }
}

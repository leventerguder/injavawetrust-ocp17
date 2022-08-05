package chapter11.understandingexceptions;

public class PrintingAnException {

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}

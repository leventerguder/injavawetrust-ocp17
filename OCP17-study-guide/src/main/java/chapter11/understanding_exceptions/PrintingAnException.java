package chapter11.understanding_exceptions;

public class PrintingAnException {

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("message : ");
            System.out.println(e.getMessage());
            System.out.println("printStackTrace : ");
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}

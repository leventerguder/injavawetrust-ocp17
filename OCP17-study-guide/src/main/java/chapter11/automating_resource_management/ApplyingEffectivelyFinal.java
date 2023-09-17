package chapter11.automating_resource_management;

public class ApplyingEffectivelyFinal {

    public static void main(String[] args) {

        final var bookReader = new MyFileClass(4);
        MyFileClass movieReader = new MyFileClass(5);
        try (bookReader;
             var tvReader = new MyFileClass(6);
             movieReader) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }

    }
}

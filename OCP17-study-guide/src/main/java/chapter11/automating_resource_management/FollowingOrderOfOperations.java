package chapter11.automating_resource_management;

public class FollowingOrderOfOperations {

    public static void main(String[] args) {


        // Remember, the resources are closed in the reverse of the order in which they are declared,
        // and the implicit finally is executed before the programmer-defined finally.

        try (MyFileClass bookReader = new MyFileClass(1);
             MyFileClass movieReader = new MyFileClass(2)) {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}

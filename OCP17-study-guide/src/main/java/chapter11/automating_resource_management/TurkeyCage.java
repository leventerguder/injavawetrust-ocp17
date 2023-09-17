package chapter11.automating_resource_management;

public class TurkeyCage implements AutoCloseable {
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (var t = new TurkeyCage()) {
            System.out.println("Put turkeys in");
        }
    }
}
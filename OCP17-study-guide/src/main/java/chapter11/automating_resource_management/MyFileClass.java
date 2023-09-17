package chapter11.automating_resource_management;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}
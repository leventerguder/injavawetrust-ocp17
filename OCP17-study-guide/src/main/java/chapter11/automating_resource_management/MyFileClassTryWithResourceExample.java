package chapter11.automating_resource_management;

public class MyFileClassTryWithResourceExample {

    public static void main(String[] args) {

        try (MyFileClass myFileClass = new MyFileClass(10)) {
            System.out.println("try-statement...");
        }
        System.out.println("after-try...");
    }
}
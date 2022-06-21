package chapter06;

public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.print(size);
    }

    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar();
        jaguar.printDetails();
    }
}

package chapter07.understanding_polymorphism;

public class EmperorPenguin2 extends Penguin {

    @Override
    public int getHeight() {
        return 8;
    }

    @Override
    public void printInfo() {
        System.out.print(super.getHeight());
    }

    public static void main(String[] fish) {
        new EmperorPenguin2().printInfo();
    }
}
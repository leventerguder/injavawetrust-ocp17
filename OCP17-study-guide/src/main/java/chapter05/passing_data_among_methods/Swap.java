package chapter05.passing_data_among_methods;

public class Swap {

    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println("original1: " + original1); // 1
        System.out.println("original2: " + original1); // 2
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("swap a : " + a); // 1
        System.out.println("swap b : " + b); // 1
    }

}

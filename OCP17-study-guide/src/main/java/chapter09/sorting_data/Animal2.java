package chapter09.sorting_data;

public class Animal2 implements Comparable<Animal2> {
    private int id;

    public int compareTo(Animal2 a) {
        return Integer.compare(id, a.id);
    }

    public static void main(String[] args) {
        var a1 = new Animal2();
        var a2 = new Animal2();

        a1.id = 5;
        a2.id = 7;

        System.out.println(a1.compareTo(a2)); // -1
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 1
    }
}

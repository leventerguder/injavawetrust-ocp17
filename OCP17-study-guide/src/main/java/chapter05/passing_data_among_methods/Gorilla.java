package chapter05.passing_data_among_methods;

public class Gorilla {

    public void rest(Long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {

        var g = new Gorilla();
        // g.rest(8); // DOES NOT COMPILE
        g.rest(8L);

    }
}

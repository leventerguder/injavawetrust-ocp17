package chapter04.creating_and_manipulating_strings;

public class CreatingString {

    public static void main(String[] args) {

        String name1 = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = """
                Fluffy""";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}
